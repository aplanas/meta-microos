SUMMARY = "A Scalable, Open Extension to CGI"
DESCRIPTION = "FastCGI is a language-independent, scalable, open extension to CGI that \
provides high performance without the limitations of server-specific \
APIs."
LICENSE = "OML"

PV = "2.4.0"

RPM_NAME = "FastCGI-2.4.0-172.30.aarch64.rpm"
RPM_HASH = "0a0499314f65e16bbfb199af98d2f6232f6f128666f84676fb1dc7b62015fc456566430d0e84615ce587462a612f4042f630df2af27f3f16f9cb801227829a8d"

RPROVIDES:${PN} += "FastCGI FastCGI(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libfcgi.so.0()(64bit)"

inherit rpm
