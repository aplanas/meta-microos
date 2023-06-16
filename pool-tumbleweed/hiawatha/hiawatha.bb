SUMMARY = "A secure and advanced webserver"
DESCRIPTION = "Hiawatha is a webserver for Unix and has been build with security in mind. \
 \
This resulted in a highly secure webserver, in both code and features. \
 \
This webserver runs on Linux, BSD, MacOS X and Windows. Although it can run any \
kind of CGI / FastCGI application, it has been optimized for usage with PHP. \
Most well known PHP frameworks and CMS applications have been tested with \
Hiawatha and ran without a problem. Hiawatha supports many web and HTTP features \
such as CGI/FastCGI, HTTP authentication, virtual host support, request \
pipelining, keep alive connections, URL rewriting and many more."
LICENSE = "GPL-2.0-only"

PV = "10.11"

RPM_NAME = "hiawatha-10.11-4.7.aarch64.rpm"
RPM_HASH = "f9d604342f54b0f0fd6dae903489ca1ebd73c66b6a826a13ee7994092fc4fe06164a67030a8e4577071275f6512fa62948b965ee65dd764903888d90fa966cc9"

RPROVIDES:${PN} += "config-hiawatha \
hiawatha"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libmbedcrypto.so.7 \
libmbedtls.so.14 \
libmbedx509.so.1 \
libxml2.so.2 \
libxslt.so.1 \
libz.so.1 \
logrotate \
systemd"

inherit rpm
