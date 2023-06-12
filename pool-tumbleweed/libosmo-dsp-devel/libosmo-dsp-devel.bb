SUMMARY = "SDR DSP primitives"
DESCRIPTION = "A library with SDR DSP primitives headers"
LICENSE = "GPL-2.0-only"

PV = "0.4.0"

RPM_NAME = "libosmo-dsp-devel-0.4.0-1.18.aarch64.rpm"
RPM_HASH = "414f670f6715a3a81c35271c1358a05793d4503745d57d2637138d22102a3aeca6a7fd36433d01648f85261b6031bfdd8faefb0396c41c7f458c4bb6db4faba1"

RPROVIDES:${PN} += "libosmo-dsp-devel \
libosmo-dsp-devel(aarch-64) \
pkgconfig(libosmodsp)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libosmodsp0"

inherit rpm
