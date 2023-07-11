SUMMARY = "C source code complexity computation utility"
DESCRIPTION = "Complexity is a tool for analyzing the complexity of 'C' program functions. \
It is very similar to the McCabe scoring, but addresses some issues not considered \
in that scoring scheme."
LICENSE = "GPL-3.0-or-later"

PV = "1.10"

RPM_NAME = "complexity-1.10-5.7.aarch64.rpm"
RPM_HASH = "05db0d883206c8cce04b28df1f24198bc5355939d3126cbdf2ea33299c55e1a6ef1e5ee158b90d22462cf1b3991d4b9851b8ac5a4433a0f8240065e15012fa7c"

RPROVIDES:${PN} += "complexity"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libopts.so.25"

inherit rpm
