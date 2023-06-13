SUMMARY = "Development files for ldacBT"
DESCRIPTION = "The ldacBT-devel package contains libraries and header files for \
developing applications that use ldacBT."
LICENSE = "Apache-2.0"

PV = "2.0.2.3"

RPM_NAME = "ldacBT-devel-2.0.2.3-4.9.aarch64.rpm"
RPM_HASH = "456c23bf73e4624ec23f99e8e5f4d8e3b7e74f49c4ba0956c2f82350d51db60c2170f7632acb8c9fbd4de5b934f43744acd5d3f7bdca940ccf71d173d91dc909"

RPROVIDES:${PN} += "ldacBT-devel \
ldacBT-devel(aarch-64) \
pkgconfig(ldacBT-abr) \
pkgconfig(ldacBT-enc)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libldac2"

inherit rpm
