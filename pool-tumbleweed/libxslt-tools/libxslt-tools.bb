SUMMARY = "Extended Stylesheet Language (XSL) Transformation utilities"
DESCRIPTION = "This package contains xsltproc, a command line interface to the XSLT engine. \
xtend the"
LICENSE = "GPL-2.0-or-later & MIT"

PV = "1.1.38"

RPM_NAME = "libxslt-tools-1.1.38-1.1.aarch64.rpm"
RPM_HASH = "617013668a289f5987f254d9ae5cd4baa31141008e9df5c2564c9b81837b153498539fc326b8c17d2cf732ede3bae1ea78233329ecdcd66281a56febf96a9b5a"

RPROVIDES:${PN} += "libxslt \
libxslt-tools \
libxslt-tools(aarch-64) \
xsltproc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libexslt.so.0()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
libxml2.so.2(LIBXML2_2.6.3)(64bit) \
libxslt.so.1()(64bit) \
libxslt.so.1(LIBXML2_1.0.11)(64bit) \
libxslt.so.1(LIBXML2_1.0.17)(64bit) \
libxslt.so.1(LIBXML2_1.0.18)(64bit) \
libxslt.so.1(LIBXML2_1.0.22)(64bit) \
libxslt.so.1(LIBXML2_1.0.24)(64bit) \
libxslt.so.1(LIBXML2_1.1.2)(64bit)"

inherit rpm
