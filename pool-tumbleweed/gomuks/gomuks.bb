SUMMARY = "A terminal Matrix client written in Go"
DESCRIPTION = "A terminal Matrix client written in Go using mautrix and mauview. \
 \
Basic usage is possible, but expect bugs and missing features."
LICENSE = "AGPL-3.0-only"

PV = "0.3.0"

RPM_NAME = "gomuks-0.3.0-2.4.aarch64.rpm"
RPM_HASH = "0b1e4a2dbc536ab359c94c70ad1bd97d0bdbbe794cbdd121c0dee3fbcfb513615db29b25b3a2e8f41c2ac8b29f4651731c657584b5648f6f7ccbc9be38c64393"

RPROVIDES:${PN} += "gomuks \
gomuks(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libolm.so.3()(64bit)"

inherit rpm
