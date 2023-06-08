SUMMARY = "An email client for your terminal"
DESCRIPTION = "aerc is an email client that runs in your terminal. It's highly \
efficient and extensible, perfect for the discerning hacker."
LICENSE = "MIT"

PV = "0.15.1"

RPM_NAME = "aerc-0.15.1-1.1.aarch64.rpm"
RPM_HASH = "9ad21b1b573d92dc55e300d150a86f6ade090f6a4d3fa2560d3e0c6c9303883b819e54f0be51b7e2a13810bce80c8b6c74f9cd1c7094a71f19f3a12f6b167b00"

RPROVIDES:${PN} += "aerc aerc(aarch-64) application() application(aerc.desktop) mimehandler(x-scheme-handler/mailto)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/awk /usr/bin/python3 libc.so.6(GLIBC_2.34)(64bit) libnotmuch.so.5()(64bit)"

inherit rpm
