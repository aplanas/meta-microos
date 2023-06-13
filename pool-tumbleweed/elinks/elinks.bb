SUMMARY = "An advanced and well-established feature-rich text mode web browser"
DESCRIPTION = "ELinks is an advanced and well-established feature-rich text mode web \
(HTTP/FTP/..) browser. ELinks can render both frames and tables, is highly \
customizable and can be extended via Lua or Guile scripts. It is very portable \
and runs on a variety of platforms. Check the about page for a more complete \
description."
LICENSE = "GPL-2.0-or-later"

PV = "0.16.1.1"

RPM_NAME = "elinks-0.16.1.1-1.1.aarch64.rpm"
RPM_HASH = "378ed4b3462e73e9747436ba83d51de5b98d588bc4d8d3e7fb054b7e869f33e2aa376c5899de60a1648074d21454cdae1259dac2fd4f1ebb788d0bed67f2986a"

RPROVIDES:${PN} += "elinks \
elinks(aarch-64) \
web_browser"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libbz2.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libexpat.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libgpm.so.2()(64bit) \
libgssapi_krb5.so.2()(64bit) \
libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) \
libidn2.so.0()(64bit) \
libluajit-5.1.so.2()(64bit) \
libm.so.6()(64bit) \
libperl.so()(64bit) \
libruby3.2.so.3.2()(64bit) \
libsqlite3.so.0()(64bit) \
libssl.so.3()(64bit) \
libstdc++.so.6()(64bit) \
libtre.so.5()(64bit) \
libxml++-5.0.so.1()(64bit) \
libxml2.so.2()(64bit) \
libz.so.1()(64bit) \
perl \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
