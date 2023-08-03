SUMMARY = "Examples for the qt6-webchannel modules"
DESCRIPTION = "Examples for the qt6-webchannel modules."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-webchannel-examples-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "faaeb45e68a55217e1d5502b92ea657ad03b878de98fb953e78338b8f17b246bf08bf7544465c2508e3104ebe3eae6cd545465bdc839303699021e06596fd54e"

RPROVIDES:${PN} += "qt6-webchannel-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libQt6WebChannel.so.6 \
libQt6WebSockets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
