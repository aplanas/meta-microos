SUMMARY = "Nodebuilder for ZDoom"
DESCRIPTION = "ZDBSP is ZDoom's (internal and external) node builder. This node \
builder was written with two design goals in mind: speed and \
minimization of polyobject bleeding."
LICENSE = "GPL-2.0+"

PV = "1.19"

RPM_NAME = "zdbsp-1.19-1.26.aarch64.rpm"
RPM_HASH = "fa3705d1a093ed1b61313138d5b04d343b6bd339d850ed3907cab33d63482758205b5b2521522d3a6d367eee74a20d1c0db98d8fc0a4dca8b424c2a26ad217f2"

RPROVIDES:${PN} += "zdbsp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
