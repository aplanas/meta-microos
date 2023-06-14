SUMMARY = "CPAN client"
DESCRIPTION = "Menlo is a backend for _cpanm 2.0_, developed with the goal to replace \
cpanm internals with a set of modules that are more flexible, extensible \
and easier to use."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.9019"

RPM_NAME = "perl-Menlo-1.9019-1.10.noarch.rpm"
RPM_HASH = "a0b059192f0e056ad61d0b99deec44319d0e3fda4b670066840c56ca867561307a74a3eede6ef3476289c549d0a4dd5e6241f7d7f825fa03b9be3db9bbc0a554"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Menlo \
perl-Menlo--Builder--Static \
perl-Menlo--Dependency \
perl-Menlo--Index--MetaCPAN \
perl-Menlo--Index--MetaDB \
perl-Menlo--Index--Mirror \
perl-Menlo--Util"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
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
