SUMMARY = "Shepherd's init binaries"
DESCRIPTION = "Binaries of shepherd conflicting with other init systems."
LICENSE = "GPL-3.0-or-later"

PV = "0.8.1"

RPM_NAME = "shepherd-bins-0.8.1-1.10.aarch64.rpm"
RPM_HASH = "c14854ffeb1b0772e517aa135c70a7937c52356cb5485f923e0693f3d4b0909ba379d48bfdb52c222180ec7b2dfc4bf6b0ccccabc5a42f039483b72bccdba8c6"

RPROVIDES:${PN} += "/sbin/shutdown \
shepherd-bins"

RDEPENDS:${PN} += "/usr/bin/guile"

inherit rpm
