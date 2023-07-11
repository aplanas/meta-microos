SUMMARY = "Web Server Hosting ASP.NET"
DESCRIPTION = "The XSP server is a Web server that hosts the Mono System.Web \
classes for running what is commonly known as ASP.NET."
LICENSE = "MIT"

PV = "4.7.1"

RPM_NAME = "xsp-4.7.1-1.17.aarch64.rpm"
RPM_HASH = "d6ff1ea67eb6eb43045e08c6292a9161dfa926968905d122ced2345af08fb7f85ffffbf80e6499a96118dffbc5b4c58b747c94914f6ece59ecaaff5410733df7"

RPROVIDES:${PN} += "config-xsp \
mono-Mono.WebServer2 \
mono-ServiceClient \
mono-asp-state4 \
mono-codebehind1 \
mono-dbpage-test-setup \
mono-dbsessmgr4 \
mono-extensions \
mono-fastcgi-mono-server4 \
mono-mod-mono-server4 \
mono-mono-fpm \
mono-tabcontrol \
mono-tabcontrol2 \
mono-treeview \
mono-typedesc \
mono-xsp4 \
pkgconfig-xsp-2 \
pkgconfig-xsp-4 \
xsp"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/pkg-config \
/usr/bin/sh \
group-www \
libc.so.6 \
libfpm-helper0 \
mono-Mono.Data.Sqlite \
mono-Mono.Posix \
mono-Mono.Security \
mono-System \
mono-System.Configuration \
mono-System.Core \
mono-System.Data \
mono-System.Web \
mono-System.Web.Services \
mono-System.Xml \
mono-mscorlib \
user-wwwrun"

inherit rpm
