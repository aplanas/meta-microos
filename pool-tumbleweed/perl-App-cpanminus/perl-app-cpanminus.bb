SUMMARY = "Get, unpack, build and install modules from CPAN"
DESCRIPTION = "cpanminus is a script to get, unpack, build and install modules from CPAN \
and does nothing else. \
 \
It's dependency free (can bootstrap itself), requires zero configuration, \
and stands alone. When running, it requires only 10MB of RAM."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.7047"

RPM_NAME = "perl-App-cpanminus-1.7047-1.2.noarch.rpm"
RPM_HASH = "044fae44b175de12440251a45fdd197d6e7f0a0d734b967c102cb8371f5ddd25a16c05444b8893375006f008e84142fc036e82b5d980ca1a10b7aa2e8f9109c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cpanm \
perl-App--cpanminus \
perl-App--cpanminus--Dependency \
perl-App--cpanminus--fatscript \
perl-App--cpanminus--script \
perl-App-cpanminus \
perl-ModuleBuildSkipMan"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0 \
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
