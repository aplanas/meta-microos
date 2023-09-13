SUMMARY = "Application to manage personal accounts"
DESCRIPTION = "HomeBank is an application to manage personal accounts at home. The main \
concept is to be light, simple and very easy to use. It brings many \
features that allows to analyze finances in a detailed way instantly and \
dynamically with powerful report tools based on filtering and graphical \
charts."
LICENSE = "GPL-2.0-or-later"

PV = "5.7"

RPM_NAME = "homebank-5.7-1.1.aarch64.rpm"
RPM_HASH = "e8e618fb1879a63f881768e3aa68d218a88fb45ee9e2194c4e525d27ecea189276eb13d52fb9577e94cf7c090674ae4bcb40d2161586d344b9b97f4df4f81058"

RPROVIDES:${PN} += "homebank"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libofx.so.7 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libsoup-2.4.so.1"

inherit rpm
