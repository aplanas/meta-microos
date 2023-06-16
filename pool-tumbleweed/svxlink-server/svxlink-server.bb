SUMMARY = "SvxLink - A general purpose voice services system"
DESCRIPTION = "The SvxLink server is a general purpose voice services system for ham radio use. \
Each voice service is implemented as a plugin called a module. Some examples of \
voice services are: Help system, Simplex repeater, EchoLink connection. \
 \
The core of the system handle the radio interface and is quite flexible as well. \
It can act both as a simplex node and as a repeater controller."
LICENSE = "GPL-2.0-only"

PV = "1.5.0"

RPM_NAME = "svxlink-server-1.5.0-5.9.aarch64.rpm"
RPM_HASH = "9a7eaf805e9166f08de06e5c09abac8c68acf192aeb345262b2f22982bf23ea5e3c3c59b642dc4cb7c1c10c2254fb4150e3cc6e63046f348e15beda29014a379"

RPROVIDES:${PN} += "config-svxlink-server \
svxlink-server"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libasyncaudio.so.1.6 \
libasynccore.so.1.6 \
libasynccpp.so.1.6 \
libc.so.6 \
libcurl.so.4 \
libecholib.so.1.3 \
libgcc-s.so.1 \
libgcrypt.so.20 \
libgsm.so.1 \
libm.so.6 \
libpopt.so.0 \
libsigc-2.0.so.0 \
libstdc++.so.6 \
libtcl8.6.so \
logrotate \
shadow"

inherit rpm
