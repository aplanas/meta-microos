SUMMARY = "A Meterbridge for the JACK Audio System"
DESCRIPTION = "Meterbridge is a JACK (JACK Audio Connection Kit) client for \
visualizing audio signals."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.3"

RPM_NAME = "meterbridge-0.9.3-1.9.aarch64.rpm"
RPM_HASH = "3bfb05f889d64357047ceeafa9a5b6cf164511324de4b554b3578408f8d4cd885c2c99e75737748ab405b5779144fd08e239a224c727f071df31d8764f8104d5"

RPROVIDES:${PN} += "meterbridge"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libSDL-1.2.so.0 \
libSDL-image-1.2.so.0 \
libc.so.6 \
libjack.so.0 \
libm.so.6"

inherit rpm
