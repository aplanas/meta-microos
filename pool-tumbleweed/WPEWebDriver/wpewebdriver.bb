SUMMARY = "WebDriver service implementation for WPE  WebKit"
DESCRIPTION = "WPE allows embedders to create simple and performant systems based on \
Web platform technologies. It is designed with hardware acceleration \
in mind, leveraging common 3D graphics APIs for best performance."
LICENSE = "BSD-3-Clause & LGPL-2.1"

PV = "2.40.3"

RPM_NAME = "WPEWebDriver-2.40.3-1.2.aarch64.rpm"
RPM_HASH = "0553c6226815075984acb46a6215afbd3630b70c97b70c0a19bf0e9bfd8fb6b870d06f8438854fe7b14c96958043f82eb289fde736b2981c98aa248e4dbe26eb"

RPROVIDES:${PN} += "WPEWebDriver"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libicui18n.so.73 \
libicuuc.so.73 \
libsoup-3.0.so.0 \
libstdc++.so.6"

inherit rpm
