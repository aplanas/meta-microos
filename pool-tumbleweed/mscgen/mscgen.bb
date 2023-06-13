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

RPM_NAME = "mscgen-0.20-3.22.aarch64.rpm"
RPM_HASH = "59efa477e091b1b5f33086f65c9b8111ea55c497333ecbca0d29a03761e4d06df781dc967a44d37a716b8d90ee096556a30883eea165279e1b5b977d2bf5b8b8"

RPROVIDES:${PN} += "mscgen \
mscgen(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgd.so.3()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
