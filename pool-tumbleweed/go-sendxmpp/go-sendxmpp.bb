SUMMARY = "A little tool to send messages to an XMPP contact or MUC"
DESCRIPTION = "A little tool to send messages to an XMPP contact or MUC."
LICENSE = "BSD-2-Clause"

PV = "0.6.0"

RPM_NAME = "go-sendxmpp-0.6.0-1.1.aarch64.rpm"
RPM_HASH = "58608fd83625fb2ff253a67cff9128c96c61cd7fc09c7b48dd3d06595f4554e27aaa2f73e6e4e5f0db9e809d5a55385b0d0c090011df95af37f9b5b03e7d785d"

RPROVIDES:${PN} += "go-sendxmpp"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
