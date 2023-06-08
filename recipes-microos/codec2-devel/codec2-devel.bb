SUMMARY = "Development library for codec2"
DESCRIPTION = "Codec 2 is a speech codec designed for communications quality speech \
between 700 and 3200 bit/s."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.0.5"

RPM_NAME = "codec2-devel-1.0.5-1.4.aarch64.rpm"
RPM_HASH = "e71a07f8ca07f90a8fb4d8639ac7058b22f9811ae31c0ff20f0d8ead6a7918ac74efbfa4419c566b64a0d26f6a8c08dc6a50aa160afa3a7a09ca5168713bd7a4"

RPROVIDES:${PN} += "cmake(codec2) codec2-devel codec2-devel(aarch-64) pkgconfig(codec2)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libcodec2-1_0"

inherit rpm
