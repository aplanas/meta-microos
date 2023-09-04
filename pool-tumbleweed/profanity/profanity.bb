SUMMARY = "Console-based XMPP client"
DESCRIPTION = "Profanity is a console-based XMPP client written in C using ncurses, \
and inspired by Irssi."
LICENSE = "SUSE-GPL-3.0+-with-openssl-exception"

PV = "0.14.0"

RPM_NAME = "profanity-0.14.0-2.1.aarch64.rpm"
RPM_HASH = "9f8d18fc47e0d7e633d6c87cc75808baa8dc01661337d856a6884a4e0f87e29e11355ad4b521c283096e80bf88047d615d7be3267de4f401d72179a1fc93b279"

RPROVIDES:${PN} += "libprofanity.so.0 \
profanity"

RDEPENDS:${PN} += "/sbin/ldconfig \
libstrophe0 \
profanity-binary"

inherit rpm
