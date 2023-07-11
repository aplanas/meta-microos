SUMMARY = "Mednafen network play server"
DESCRIPTION = "Network play server for mednafen"
LICENSE = "GPL-2.0-only"

PV = "0.5.2"

RPM_NAME = "mednafen-server-0.5.2-9.7.aarch64.rpm"
RPM_HASH = "eda3446033ec77f8b53bbdccf34e067e1f0d15c53ef61a82131479d97a5b1f179fa64dd084260165b3134a30e043e38a2aeda5c0b586e7ffab023abca3122a89"

RPROVIDES:${PN} += "config-mednafen-server \
mednafen-server"

RDEPENDS:${PN} += "/usr/bin/sh \
group-games \
ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6 \
shadow"

inherit rpm
