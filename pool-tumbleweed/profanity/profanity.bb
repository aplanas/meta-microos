SUMMARY = "Console-based XMPP client"
DESCRIPTION = "Profanity is a console-based XMPP client written in C using ncurses, \
and inspired by Irssi."
LICENSE = "SUSE-GPL-3.0+-with-openssl-exception"

PV = "0.13.1"

RPM_NAME = "profanity-0.13.1-1.6.aarch64.rpm"
RPM_HASH = "08ea915e00653f83cb054fe22c2749b7b4fe0b49b4742d3f0fa827982a502816e5874cc7a66b6be15efa3047cf8fddabd136efe594b09b3dd5c10e98c8489b34"

RPROVIDES:${PN} += "libprofanity.so.0 \
profanity"

RDEPENDS:${PN} += "/sbin/ldconfig \
libstrophe0 \
profanity-binary"

inherit rpm
