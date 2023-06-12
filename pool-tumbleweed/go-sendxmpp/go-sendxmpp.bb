SUMMARY = "A little tool to send messages to an XMPP contact or MUC"
DESCRIPTION = "A little tool to send messages to an XMPP contact or MUC."
LICENSE = "BSD-2-Clause"

PV = "0.5.6"

RPM_NAME = "go-sendxmpp-0.5.6-1.4.aarch64.rpm"
RPM_HASH = "3bfbf0000e5e4afacde28d80707d6bb09a1798fd6134dfa3a1e36d27cd629bdd5cc3d05229bd9e70d46ab9f6ec017f8118f91793625efebcd69c112b60a1fbf8"

RPROVIDES:${PN} += "go-sendxmpp \
go-sendxmpp(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
