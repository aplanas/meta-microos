SUMMARY = "Development Files for libspecimen0"
DESCRIPTION = "Header and development files for font-specimen library."
LICENSE = "GPL-2.0+"

PV = "20150202"

RPM_NAME = "font-specimen-devel-20150202-3.18.aarch64.rpm"
RPM_HASH = "58e53cb2652748755d7a308353fa5b679032c4f2b9b3d57117f7b754cdea35928c5f3892a89ceaf8585f24c4751dd94473e78a38b5bf8237dd1f6270d87a74bb"

RPROVIDES:${PN} += "font-specimen-devel \
pkgconfig-font-specimen"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libfont-specimen0"

inherit rpm
