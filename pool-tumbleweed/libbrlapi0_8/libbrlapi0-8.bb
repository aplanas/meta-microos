SUMMARY = "Library to use BRLTTY from applications"
DESCRIPTION = "BrlAPI is a service provided by the brltty daemon. \
 \
Its purpose is to allow programmers to write applications that take \
advantage of a braille terminal in order to deliver a blind user \
suitable information for his/her specific needs. \
 \
While an application communicates with the braille terminal, everything \
brltty sends to the braille terminal in the application's console is \
ignored, whereas each piece of data coming from the braille terminal is \
sent to the application, rather than to brltty."
LICENSE = "LGPL-2.1-or-later"

PV = "6.5"

RPM_NAME = "libbrlapi0_8-6.5-3.1.aarch64.rpm"
RPM_HASH = "acdb6ba4968f06c1296abf59cc3d69b916ac2d85bf557d6d885ebe8cf924b75eae6d62f5ffd0cf472f578c150909327bf12fb15e150e3e2c7a6aad76e97c1d37"

RPROVIDES:${PN} += "libbrlapi.so.0.8 \
libbrlapi0-8"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
coreutils \
group-brlapi \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsystemd.so.0 \
util-linux"

inherit rpm
