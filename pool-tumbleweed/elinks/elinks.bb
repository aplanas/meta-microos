SUMMARY = "An advanced and well-established feature-rich text mode web browser"
DESCRIPTION = "ELinks is an advanced and well-established feature-rich text mode web \
(HTTP/FTP/..) browser. ELinks can render both frames and tables, is highly \
customizable and can be extended via Lua or Guile scripts. It is very portable \
and runs on a variety of platforms. Check the about page for a more complete \
description."
LICENSE = "GPL-2.0-or-later"

PV = "0.16.1.1"

RPM_NAME = "elinks-0.16.1.1-2.1.aarch64.rpm"
RPM_HASH = "3288c66b46628194aceebc5f50ed4115918a9bf3ceda1b7f87998eb1a1658a3070f8848a6c25b430fa3e47910d3998872acabd4ff7d9a2d94571c60161b98f42"

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
perl--MODULE-COMPAT-5.38.0"

inherit rpm
