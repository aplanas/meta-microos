SUMMARY = "The Speech Synthesis System"
DESCRIPTION = "Festival is a multilingual speech synthesis system developed at CSTR. \
It offers a full text-to-speech system with various APIs as well as an \
environment for development and research of speech synthesis \
techniques. It is written in C++ and has a Scheme-based command \
interpreter for general control."
LICENSE = "BSD-3-Clause"

PV = "2.5.0"

RPM_NAME = "festival-2.5.0-8.9.aarch64.rpm"
RPM_HASH = "496b302ae2ee057527c71ad773531ce78e3d94c61c1a1198e3b03a2e20155d8cfe1642ebcbbfdf250b8f81ceb6c1c563a2907d22b7e087369eca83be4ba29c23"

RPROVIDES:${PN} += "config-festival \
festival"

RDEPENDS:${PN} += "/bin/sh \
/usr/sbin/groupadd \
/usr/sbin/useradd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libtinfo.so.6"

inherit rpm
