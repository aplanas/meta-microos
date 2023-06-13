SUMMARY = "A scalable, open extension to CGI - System library"
DESCRIPTION = "FastCGI is a language independent, scalable, open extension to CGI that \
provides high performance without the limitations of server specific \
APIs."
LICENSE = "OML"

PV = "2.4.0"

RPM_NAME = "libfcgi0-2.4.0-173.1.aarch64.rpm"
RPM_HASH = "d2c406de3a52435a54472c323e691c692fbdccf3f3458b7033aed8480615f3607166669b294ec2760a8d9cdfd743a0c2b17f5214b8d55b30cc9e87f28ecede91"

RPROVIDES:${PN} += "libfcgi++-0 \
libfcgi++.so.0()(64bit) \
libfcgi.so.0()(64bit) \
libfcgi0 \
libfcgi0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
