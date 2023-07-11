SUMMARY = "Development package for xmlrpc-c"
DESCRIPTION = "XML-RPC is a lightweight RPC protocol based on XML and HTTP. This \
package is used by XML-RPC clients and servers written in C and C++. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of xmlrpc-c."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.54.06"

RPM_NAME = "xmlrpc-c-devel-1.54.06-1.4.aarch64.rpm"
RPM_HASH = "ce67b80b99f6b7f4349e7dcfd46668208d51ca8cd9cb690af833a139b0a24587c0f0b4e1e7d6097d28377336c428548ce2098b83950fe03b29734c5563d49fc1"

RPROVIDES:${PN} += "pkgconfig-xmlrpc \
pkgconfig-xmlrpc++ \
pkgconfig-xmlrpc-abyss \
pkgconfig-xmlrpc-abyss++ \
pkgconfig-xmlrpc-client \
pkgconfig-xmlrpc-client++ \
pkgconfig-xmlrpc-server \
pkgconfig-xmlrpc-server++ \
pkgconfig-xmlrpc-server-abyss \
pkgconfig-xmlrpc-server-cgi \
pkgconfig-xmlrpc-server-pstream++ \
pkgconfig-xmlrpc-util \
pkgconfig-xmlrpc-util++ \
xmlrpc-c-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libxmlrpc++8 \
libxmlrpc-abyss++8 \
libxmlrpc-abyss3 \
libxmlrpc-client++8 \
libxmlrpc-client3 \
libxmlrpc-cpp8 \
libxmlrpc-packetsocket8 \
libxmlrpc-server++8 \
libxmlrpc-server-abyss++8 \
libxmlrpc-server-abyss3 \
libxmlrpc-server-cgi++8 \
libxmlrpc-server-cgi3 \
libxmlrpc-server-pstream++8 \
libxmlrpc-server3 \
libxmlrpc-util++8 \
libxmlrpc-util4 \
libxmlrpc3 \
pkgconfig-libxml-2.0 \
pkgconfig-xmlrpc \
pkgconfig-xmlrpc++ \
pkgconfig-xmlrpc-abyss \
pkgconfig-xmlrpc-client \
pkgconfig-xmlrpc-server \
pkgconfig-xmlrpc-server++ \
pkgconfig-xmlrpc-util \
pkgconfig-xmlrpc-util++"

inherit rpm
