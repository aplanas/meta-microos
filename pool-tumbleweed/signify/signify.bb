SUMMARY = "OpenBSD tool to sign and verify signatures on files (portable version)"
DESCRIPTION = "Signify - Sign and Verify. \
A portable version of the OpenBSD tool to sign and verify signatures on files. \
See http://www.tedunangst.com/flak/post/signify for more information."
LICENSE = "BSD-3-Clause"

PV = "31"

RPM_NAME = "signify-31-1.3.aarch64.rpm"
RPM_HASH = "4922318e1d768198b0a7a61d84dd7a224467f1cc41adad44685f6817ea43b876417caacd125dd146cf9a0a5ada69a551dfb969be562d4b23dc9e70d9c3e27666"

RPROVIDES:${PN} += "signify \
signify(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbsd.so.0()(64bit) \
libbsd.so.0(LIBBSD_0.0)(64bit) \
libbsd.so.0(LIBBSD_0.11.0)(64bit) \
libbsd.so.0(LIBBSD_0.2)(64bit) \
libc.so.6(GLIBC_2.36)(64bit)"

inherit rpm
