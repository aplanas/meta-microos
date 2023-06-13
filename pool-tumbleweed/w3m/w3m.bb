SUMMARY = "A text-based WWW browser"
DESCRIPTION = "W3m is a pager and text-based WWW browser. It has a number of useful \
features: \
 \
* w3m can render tables \
 \
* w3m can render frames (it converts the frames into a table) \
 \
* SSL support \
 \
* w3m can easily display documents from standard input \
 \
* w3m can handle cookies \
 \
* w3m is small \
 \
* w3m has mouse support \
 \
If w3m-inline-image is installed it can display graphics inside \
terminals, even on the console on some platforms."
LICENSE = "ISC"

PV = "0.5.3+git20230121"

RPM_NAME = "w3m-0.5.3+git20230121-1.1.aarch64.rpm"
RPM_HASH = "84b6685731f3ba7b8cff6443fc2428fa1e6fb7a5104d5f9000cd644d94b48a28770e66efaf403e6c90f6aa90dec05b445d2b488bacec5243f5d4ad0970dc016c"

RPROVIDES:${PN} += "w3m \
w3m(aarch-64) \
w3m_ssl \
web_browser"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libgc.so.1()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libz.so.1()(64bit)"

inherit rpm
