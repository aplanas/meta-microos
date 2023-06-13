SUMMARY = "Web Server Hosting ASP.NET"
DESCRIPTION = "The XSP server is a Web server that hosts the Mono System.Web \
classes for running what is commonly known as ASP.NET."
LICENSE = "MIT"

PV = "4.7.1"

RPM_NAME = "xsp-4.7.1-1.16.aarch64.rpm"
RPM_HASH = "54c2f01cc2490dfa9675024c3bee942fa5fb83e43563feefa57328640255ed6069ecb86f0e635428cfaeeedb78c746ec8fd0ea993734f53082f7d43435bb74ec"

RPROVIDES:${PN} += "config(xsp) \
mono(Mono.WebServer2) \
mono(ServiceClient) \
mono(asp-state4) \
mono(codebehind1) \
mono(dbpage_test_setup) \
mono(dbsessmgr4) \
mono(extensions) \
mono(fastcgi-mono-server4) \
mono(mod-mono-server4) \
mono(mono-fpm) \
mono(tabcontrol) \
mono(tabcontrol2) \
mono(treeview) \
mono(typedesc) \
mono(xsp4) \
pkgconfig(xsp-2) \
pkgconfig(xsp-4) \
xsp \
xsp(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/pkg-config \
group(www) \
libc.so.6(GLIBC_2.34)(64bit) \
libfpm_helper0 \
mono(Mono.Data.Sqlite) \
mono(Mono.Posix) \
mono(Mono.Security) \
mono(System) \
mono(System.Configuration) \
mono(System.Core) \
mono(System.Data) \
mono(System.Web) \
mono(System.Web.Services) \
mono(System.Xml) \
mono(mscorlib) \
user(wwwrun)"

inherit rpm
