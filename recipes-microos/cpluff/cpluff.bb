SUMMARY = "A plug-in framework for C"
DESCRIPTION = "C-Pluff is a plug-in framework for C programs. It has been strongly inspired by \
the Java plug-in framework in Eclipse. C-Pluff focuses on providing core \
services for plug-in interaction and plug-in management. It aims to be platform \
neutral and supports dynamic changes to plug-in configuration without stopping \
the whole application or framework."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "cpluff-0.2.0-2.8.aarch64.rpm"
RPM_HASH = "7630e958cdb18961d0cd52cfbcc0de76952a6d8480daa0ee777433b9533a8cd4e7fdfd438ca3eea51a2d7fd68eec2a9372958ead53ffc10b765172f5c84a4114"

RPROVIDES:${PN} += "cpluff cpluff(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcpluff.so.0()(64bit) libreadline.so.8()(64bit)"

inherit rpm
