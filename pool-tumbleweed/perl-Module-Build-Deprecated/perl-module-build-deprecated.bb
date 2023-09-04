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

RPM_NAME = "perl-Module-Build-Deprecated-0.4210-1.25.noarch.rpm"
RPM_HASH = "e23547d1b5cb51f6728b50aff1ad6f7971b11fa6d945118c34b79caa27312f616cce5a9a8be74890b3d5dd8d6d4042fcd1ab7460e55f7f72b5fd2e52a91a0129"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Module--Build--Deprecated \
perl-Module--Build--ModuleInfo \
perl-Module--Build--Version \
perl-Module--Build--YAML \
perl-Module-Build-Deprecated"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-CPAN--Meta--YAML \
perl-Module--Metadata \
perl-parent \
perl-version"

inherit rpm
