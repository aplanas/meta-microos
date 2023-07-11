SUMMARY = "SDR DSP primitives"
DESCRIPTION = "A library with SDR DSP primitives headers"
LICENSE = "GPL-2.0-only"

PV = "0.4.0"

RPM_NAME = "libosmo-dsp-devel-0.4.0-1.19.aarch64.rpm"
RPM_HASH = "ebf48604ca234d35af4c3cef6ded858575712d0e0e3164a66e876a060355e688fdf32e8af3aa7ac31c078233c2d97d36305684ce71652091f31f9dd08cdd122d"

RPROVIDES:${PN} += "libosmo-dsp-devel \
pkgconfig-libosmodsp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libosmodsp0"

inherit rpm
