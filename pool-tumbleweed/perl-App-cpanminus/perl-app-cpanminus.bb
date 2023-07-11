SUMMARY = "Get, unpack, build and install modules from CPAN"
DESCRIPTION = "cpanminus is a script to get, unpack, build and install modules from CPAN \
and does nothing else. \
 \
It's dependency free (can bootstrap itself), requires zero configuration, \
and stands alone. When running, it requires only 10MB of RAM."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.7046"

RPM_NAME = "perl-App-cpanminus-1.7046-1.7.noarch.rpm"
RPM_HASH = "08915135f2c6a563eb83ac6cdfdcbdeb772d46d40f4f5f5d9d310042ed49a644e4f0ffaf4c2a1443168b1bad6e6e5ad1c2e328df72bb351ea775884f4e8aed57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cpanm \
perl-App--cpanminus \
perl-App--cpanminus--Dependency \
perl-App--cpanminus--fatscript \
perl-App--cpanminus--script \
perl-App-cpanminus \
perl-ModuleBuildSkipMan"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1 \
perl-CPAN--DistnameInfo \
perl-CPAN--Meta \
perl-CPAN--Meta--Check \
perl-CPAN--Meta--Prereqs \
perl-CPAN--Meta--YAML \
perl-Digest--SHA \
perl-ExtUtils--Install \
perl-ExtUtils--MakeMaker \
perl-ExtUtils--Manifest \
perl-File--pushd \
perl-HTTP--Tiny \
perl-Module--Build \
perl-Module--CPANfile \
perl-Module--CoreList \
perl-Module--Metadata \
perl-Parse--PMFile \
perl-String--ShellQuote \
perl-YAML \
perl-local--lib"

inherit rpm
