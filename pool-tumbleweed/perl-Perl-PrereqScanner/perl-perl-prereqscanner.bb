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

RPM_NAME = "perl-Perl-PrereqScanner-1.100-1.2.noarch.rpm"
RPM_HASH = "2955dddc5071e59697a2800eddd246facea3f48f5a8013fa626e8aa4e63aea1c5ec377e53bc37b304325124786023af4f9a3e9bffad12c40f593d83f269f5b16"
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
perl--MODULE-COMPAT-5.36.1 \
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
