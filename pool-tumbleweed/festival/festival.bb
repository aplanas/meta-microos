SUMMARY = "The Speech Synthesis System"
DESCRIPTION = "Festival is a multilingual speech synthesis system developed at CSTR. \
It offers a full text-to-speech system with various APIs as well as an \
environment for development and research of speech synthesis \
techniques. It is written in C++ and has a Scheme-based command \
interpreter for general control."
LICENSE = "BSD-3-Clause"

PV = "2.5.0"

RPM_NAME = "festival-2.5.0-8.10.aarch64.rpm"
RPM_HASH = "df3bd3f404fbebd8e437e1a5120740a40cb67e180938d9ab1cd614f7b302f3504d08c1d1c26554ae683ad99bd3df8ab0464883fa8e7639d10891fa25c6e14d79"

RPROVIDES:${PN} += "config-festival \
festival"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/sbin/groupadd \
/usr/sbin/useradd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libtinfo.so.6"

inherit rpm
