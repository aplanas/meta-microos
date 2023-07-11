SUMMARY = "VisualOn AMR-WB encoder library"
DESCRIPTION = "This library contains an encoder implementation of the Adaptive \
Multi Rate Wideband (AMR-WB) audio codec. The library is based \
on a codec implementation by VisualOn as part of the Stagefright \
framework from the Google Android project."
LICENSE = "Apache-2.0"

PV = "0.1.3+5"

RPM_NAME = "libvo-amrwbenc0-0.1.3+5-1.2.aarch64.rpm"
RPM_HASH = "704bc49af4e77587f29af3ec888a50d76286f6c82930aa52470bb72fa134c86f40f4aca01d402d790f16b417dca21dccbf9df89d19f146af85c997b8a3052996"

RPROVIDES:${PN} += "libvo-amrwbenc.so.0 \
libvo-amrwbenc0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
