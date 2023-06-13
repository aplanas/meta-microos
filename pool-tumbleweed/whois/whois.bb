SUMMARY = "Intelligent WHOIS client"
DESCRIPTION = "This package provides a commandline client for the WHOIS (RFC 3912) \
protocol, which queries online servers for information such as contact \
details for domains and IP address assignments. \
It can intelligently select the appropriate WHOIS server for most queries. \
 \
The package also contains mkpasswd, a features-rich front end to the \
password encryption function crypt(3)."
LICENSE = "GPL-2.0-or-later"

PV = "5.5.17"

RPM_NAME = "whois-5.5.17-1.1.aarch64.rpm"
RPM_HASH = "3284b7742b02cbd30ef1785ed565c950fa073d120008c6c524fe61a30c2606d4e3939932cd86c63c9089cd8f6b061ed109418c52aa99ab86d8ed00e69cbc1d4b"

RPROVIDES:${PN} += "ripe-whois-tools \
whois \
whois(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypt.so.1()(64bit) \
libcrypt.so.1(XCRYPT_2.0)(64bit) \
libidn2.so.0()(64bit) \
libidn2.so.0(IDN2_0.0.0)(64bit) \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
