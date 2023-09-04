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

RPM_NAME = "whois-5.5.18-1.2.aarch64.rpm"
RPM_HASH = "174e629c8148fd3f827af9c9e54410bc206f1c128c1cc1c081bc94925ea814512dca980e9aaa59f434c1894fc07b16a959f8d9b7b49f2f2052c893fb4ba7ac23"

RPROVIDES:${PN} += "ripe-whois-tools \
whois"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libidn2.so.0 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
