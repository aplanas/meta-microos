SUMMARY = "Header files for the Osmocom SABP library"
DESCRIPTION = "Osmocom code for the Service Area Broadcast Protocol interface. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmo-sabp."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "libosmo-sabp-devel-1.4.0-1.1.aarch64.rpm"
RPM_HASH = "31e60ac9523e90ae402b588000d954882e68ae0e47a100093bdffba6b22ff98edb2986a7bcfc42ba17d251f105d58a055e2cd641dd00c86218aa0594f6a6e151"

RPROVIDES:${PN} += "libosmo-sabp-devel \
pkgconfig-libosmo-sabp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libosmo-sabp1"

inherit rpm
