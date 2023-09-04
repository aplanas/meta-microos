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

PV = "6.6"

RPM_NAME = "libbrlapi0_8-6.6-1.1.aarch64.rpm"
RPM_HASH = "ea6bfc46560cf34e43d1317c4ddcbf596cfe1d96515b870a6cb78138619c7bb3b2fb937ce57f0ef544e39def301fb2943302ebb677e560828c24fe1abe5c6c76"

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
