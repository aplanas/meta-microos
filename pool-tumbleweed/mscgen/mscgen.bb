SUMMARY = "Message Sequence Chart Renderer"
DESCRIPTION = "Mscgen is a small program that parses Message Sequence Chart descriptions and \
produces PNG, EPS, SVG or server side image maps (ismaps) as the \
output. Message Sequence Charts (MSCs) are a way of representing entities and \
interactions over some time period and are often used in combination with SDL. \
MSCs are popular in Telecoms to specify how protocols operate although MSCs \
need not be complicated to create or use. Mscgen aims to provide a simple text \
language that is clear to create, edit and understand, which can also be \
transformed into images."
LICENSE = "GPL-2.0"

PV = "0.20"

RPM_NAME = "mscgen-0.20-3.23.aarch64.rpm"
RPM_HASH = "80fb64706e16083367fbd85c0b17eb042c1a177264a364c917f88650ec283bb2bb01435c2fdbcfef9323bebbda48e5e04df7551df86d3960d1d55f2204ef8f15"

RPROVIDES:${PN} += "mscgen"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgd.so.3 \
libm.so.6"

inherit rpm
