SUMMARY = "IBus input method support for gtk3 applications"
DESCRIPTION = "This package contains ibus im module for use by gtk3."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.28"

RPM_NAME = "ibus-gtk3-1.5.28-2.2.aarch64.rpm"
RPM_HASH = "8a2bea1ae7f9e0e1b59b065114135d610c3a8ca653da987c967f5ef84be8a473872b07e0e9c4ed9c0e0f1d933cd0512f7a3051a69bc0c7641f6399980aa855e7"

RPROVIDES:${PN} += "ibus-gtk3"

RDEPENDS:${PN} += "/usr/bin/sh \
ibus \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libibus-1.0.so.5 \
libpango-1.0.so.0"

inherit rpm
