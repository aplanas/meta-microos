SUMMARY = "Reliable Internet Stream Transport protocol"
DESCRIPTION = "A library that can be used to speak the RIST protocol (as defined by Video \
Services Forum (VSF) Technical Recommendations TR-06-1 and TR-06-2)."
LICENSE = "BSD-2-Clause"

PV = "0.2.7"

RPM_NAME = "librist4-0.2.7-2.4.aarch64.rpm"
RPM_HASH = "c6ec64e978b1a50aabcca2b115714c957351d6954ff455652cc2071e9281591d9f406ec8691d355f17fb64a1ae54cd343056aca19be48588ce69145f7427d762"

RPROVIDES:${PN} += "librist.so.4 \
librist4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
