SUMMARY = "Free tWnn Chinese Input System (Taiwan)"
DESCRIPTION = "Free tWnn Chinese input system (Taiwan)."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.1a023.1"

RPM_NAME = "ftwnn-1.1.1a023.1-4.4.aarch64.rpm"
RPM_HASH = "3a478d6ae49c7354a41fad2a9f47394745f467a53ec89e24e46aa8cd4233c41e549c7fd528306036e30fcc9c3ff476c546666633471fd086eca47943d228eb71"

RPROVIDES:${PN} += "config-ftwnn \
ftwnn"

RDEPENDS:${PN} += "/usr/bin/sh \
fcwnn \
fcwnncom \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libwrap.so.0 \
shadow"

inherit rpm
