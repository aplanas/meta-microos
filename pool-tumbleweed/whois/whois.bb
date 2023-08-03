SUMMARY = "Intelligent WHOIS client"
DESCRIPTION = "This package provides a commandline client for the WHOIS (RFC 3912) \
protocol, which queries online servers for information such as contact \
details for domains and IP address assignments. \
It can intelligently select the appropriate WHOIS server for most queries. \
 \
The package also contains mkpasswd, a features-rich front end to the \
password encryption function crypt(3)."
LICENSE = "GPL-2.0-or-later"

PV = "5.5.18"

RPM_NAME = "whois-5.5.18-1.1.aarch64.rpm"
RPM_HASH = "b13c1d3e570137f7640894c31f4ff1ad573af20dcd656b0d4ad52f26c75cf0322c23ee684e4297ce08ef8ebd44624edebaf16a08f33faf02ede6fc2a21b19eac"

RPROVIDES:${PN} += "ripe-whois-tools \
whois"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libidn2.so.0 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
