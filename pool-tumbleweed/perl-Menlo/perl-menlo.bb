SUMMARY = "CPAN client"
DESCRIPTION = "Menlo is a backend for _cpanm 2.0_, developed with the goal to replace \
cpanm internals with a set of modules that are more flexible, extensible \
and easier to use."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.9019"

RPM_NAME = "perl-Menlo-1.9019-1.11.noarch.rpm"
RPM_HASH = "f8d37fa73b471fbf89874e5188133364eabe210418bd80037c4edd3704b1c595cc9996df28698cb39abb0c4b564be93dc54f28cd57abb262da53c4593e77abc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Menlo \
perl-Menlo--Builder--Static \
perl-Menlo--Dependency \
perl-Menlo--Index--MetaCPAN \
perl-Menlo--Index--MetaDB \
perl-Menlo--Index--Mirror \
perl-Menlo--Util"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-CPAN--Common--Index \
perl-CPAN--DistnameInfo \
perl-CPAN--Meta \
perl-CPAN--Meta--Check \
perl-CPAN--Meta--Requirements \
perl-CPAN--Meta--YAML \
perl-Capture--Tiny \
perl-Class--Tiny \
perl-ExtUtils--Config \
perl-ExtUtils--Helpers \
perl-ExtUtils--InstallPaths \
perl-File--Which \
perl-File--pushd \
perl-Getopt--Long \
perl-HTTP--Tiny \
perl-HTTP--Tinyish \
perl-JSON--PP \
perl-Module--CPANfile \
perl-Module--CoreList \
perl-Module--Metadata \
perl-Parse--CPAN--Meta \
perl-Parse--PMFile \
perl-String--ShellQuote \
perl-URI \
perl-local--lib \
perl-parent \
perl-version"

inherit rpm
