SUMMARY = "A Scalable, Open Extension to CGI"
DESCRIPTION = "FastCGI is a language-independent, scalable, open extension to CGI that \
provides high performance without the limitations of server-specific \
APIs."
LICENSE = "OML"

PV = "2.4.0"

RPM_NAME = "FastCGI-2.4.0-173.1.aarch64.rpm"
RPM_HASH = "8907fdddf9b08f1fa8fc42032bf399fd915d011c6c56ee1b39f8a0641c276074e01abfbaea807ae9b599fffbcf9d20c1b8ff430b5d2288d21f4644d26d368a4c"

RPROVIDES:${PN} += "FastCGI \
FastCGI(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfcgi.so.0()(64bit)"

inherit rpm
