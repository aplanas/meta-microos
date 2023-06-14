SUMMARY = "Tool to scan your Perl code for its prerequisites"
DESCRIPTION = "The scanner will extract loosely your distribution prerequisites from your \
files. \
 \
The extraction may not be perfect but tries to do its best. It will \
currently find the following prereqs: \
 \
  * plain lines beginning with 'use' or 'require' in your perl modules and \
scripts, including minimum perl version \
 \
  * regular inheritance declared with the 'base' and 'parent' pragmata \
 \
  * Moose inheritance declared with the 'extends' keyword \
 \
  * Moose roles included with the 'with' keyword \
 \
  * OO namespace aliasing using the 'aliased' module"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.100"

RPM_NAME = "perl-Perl-PrereqScanner-1.100-1.1.noarch.rpm"
RPM_HASH = "57d859b77cc7ad8ce17c64293a211e539c23273153d0789ef14265b2d446d84db823332d613bf3a9c5efa8d289baa6201f3277ddf3d8c06e4b5f6f5b23e00102"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Perl--PrereqScanner \
perl-Perl--PrereqScanner--Scanner \
perl-Perl--PrereqScanner--Scanner--Aliased \
perl-Perl--PrereqScanner--Scanner--Moose \
perl-Perl--PrereqScanner--Scanner--POE \
perl-Perl--PrereqScanner--Scanner--Perl5 \
perl-Perl--PrereqScanner--Scanner--Superclass \
perl-Perl--PrereqScanner--Scanner--TestMore \
perl-Perl-PrereqScanner"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.0 \
perl-CPAN--Meta--Requirements \
perl-Getopt--Long--Descriptive \
perl-List--Util \
perl-Module--Path \
perl-Moo \
perl-Moo--Role \
perl-PPI \
perl-Params--Util \
perl-String--RewritePrefix \
perl-Types--Standard \
perl-namespace--autoclean"

inherit rpm
