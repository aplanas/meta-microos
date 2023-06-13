SUMMARY = "Sophisticated exporter for custom-built routines"
DESCRIPTION = "*ACHTUNG!* If you're not familiar with Exporter or exporting, read \
Sub::Exporter::Tutorial first!"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.989"

RPM_NAME = "perl-Sub-Exporter-0.989-1.2.noarch.rpm"
RPM_HASH = "ab58ca13c90227def3672515ffe17abeddd909531ac3c843abab2bf09d2e1a1d61ef58734f977ad80448ae2d94934d5eccf94c72c6e923f86e0f79fb5f7f350a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Sub::Exporter) \
perl(Sub::Exporter::Util) \
perl-Sub-Exporter"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Data::OptList) \
perl(Params::Util) \
perl(Sub::Install)"

inherit rpm
