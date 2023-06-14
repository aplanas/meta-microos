SUMMARY = "Console-based XMPP client"
DESCRIPTION = "Profanity is a console-based XMPP client written in C using ncurses, \
and inspired by Irssi."
LICENSE = "SUSE-GPL-3.0+-with-openssl-exception"

PV = "0.13.1"

RPM_NAME = "profanity-0.13.1-1.4.aarch64.rpm"
RPM_HASH = "db81f3a97e9caf00c46820732917ac104fdb71b48b6ee3e78d0b776cf032f90d527a5b3ae6eda92a7f9be66b0aec1ce462d63106c33a9c1883d06803009089f8"

RPROVIDES:${PN} += "libprofanity.so.0 \
profanity"

RDEPENDS:${PN} += "/sbin/ldconfig \
libstrophe0 \
profanity-binary"

inherit rpm
