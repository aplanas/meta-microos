SUMMARY = "A plug-in framework for C"
DESCRIPTION = "C-Pluff is a plug-in framework for C programs. It has been strongly inspired by \
the Java plug-in framework in Eclipse. C-Pluff focuses on providing core \
services for plug-in interaction and plug-in management. It aims to be platform \
neutral and supports dynamic changes to plug-in configuration without stopping \
the whole application or framework."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "cpluff-0.2.0-2.9.aarch64.rpm"
RPM_HASH = "893930c14c019a00707169c2309185a03ac5e8246da043c747bae3e940e650c63f70f952d3c3ce0cc07a5c7a8515b4958caa17a41fd26026dbf2206d2b75769e"

RPROVIDES:${PN} += "cpluff"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcpluff.so.0 \
libreadline.so.8"

inherit rpm
