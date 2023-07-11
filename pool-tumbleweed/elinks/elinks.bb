SUMMARY = "An advanced and well-established feature-rich text mode web browser"
DESCRIPTION = "ELinks is an advanced and well-established feature-rich text mode web \
(HTTP/FTP/..) browser. ELinks can render both frames and tables, is highly \
customizable and can be extended via Lua or Guile scripts. It is very portable \
and runs on a variety of platforms. Check the about page for a more complete \
description."
LICENSE = "GPL-2.0-or-later"

PV = "0.16.1.1"

RPM_NAME = "elinks-0.16.1.1-1.3.aarch64.rpm"
RPM_HASH = "7ba1c98bb94c56328891b981d9cb18aedfeae075be322e3849d8626629d40ab44c4f26d83bb5ba8aa73e819b5c443ba7a23df7e59015ef5681919f5f3231b337"

RPROVIDES:${PN} += "elinks \
web-browser"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libcrypto.so.3 \
libexpat.so.1 \
libgcc-s.so.1 \
libgpm.so.2 \
libgssapi-krb5.so.2 \
libidn2.so.0 \
libluajit-5.1.so.2 \
libm.so.6 \
libperl.so \
libruby3.2.so.3.2 \
libsqlite3.so.0 \
libssl.so.3 \
libstdc++.so.6 \
libtre.so.5 \
libxml++-5.0.so.1 \
libxml2.so.2 \
libz.so.1 \
perl \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
