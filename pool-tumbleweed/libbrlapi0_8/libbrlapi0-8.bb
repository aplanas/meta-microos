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

RPM_NAME = "libbrlapi0_8-6.5-2.4.aarch64.rpm"
RPM_HASH = "c5894f59c6fdb8be3e9947ee8ba7ea836f48c31ade770d1500447406c2e59cd39b185c7be73f1ad5ef8a928241ba406d2e2af963746c80954311c9093acadc22"

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
