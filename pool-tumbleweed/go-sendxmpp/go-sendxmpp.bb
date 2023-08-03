SUMMARY = "A little tool to send messages to an XMPP contact or MUC"
DESCRIPTION = "A little tool to send messages to an XMPP contact or MUC."
LICENSE = "BSD-2-Clause"

PV = "0.6.1"

RPM_NAME = "go-sendxmpp-0.6.1-1.1.aarch64.rpm"
RPM_HASH = "77f05d0ba85c781114a9899ccda1716b5c3c739178831103580be2363d4cb1633901405f3c9555d619b28b73b9a8dea45604105e73b37050f3ae194f837177e9"

RPROVIDES:${PN} += "go-sendxmpp"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
