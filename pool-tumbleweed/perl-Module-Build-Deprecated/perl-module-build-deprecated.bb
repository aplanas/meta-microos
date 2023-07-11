SUMMARY = "Collection of Modules Removed From Module-Build"
DESCRIPTION = "This module contains a number of module that have been removed from \
Module-Build: \
 \
* * Module::Build::ModuleInfo \
 \
This has been superceded by Module::Metadata \
 \
* * Module::Build::Version \
 \
This has been replaced by version \
 \
* * Module::Build::YAML \
 \
This has been replaced by CPAN::Meta::YAML"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.4210"

RPM_NAME = "perl-Module-Build-Deprecated-0.4210-1.24.noarch.rpm"
RPM_HASH = "bfa72d07e527473678f648811ebd0e6471b7229c821ed8cd35d0d4815772617a3eb98cdc5bbefa1f6291b62e0b7b06050adcc36f8be25acfa867da5df6e2a910"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Module--Build--Deprecated \
perl-Module--Build--ModuleInfo \
perl-Module--Build--Version \
perl-Module--Build--YAML \
perl-Module-Build-Deprecated"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-CPAN--Meta--YAML \
perl-Module--Metadata \
perl-parent \
perl-version"

inherit rpm
