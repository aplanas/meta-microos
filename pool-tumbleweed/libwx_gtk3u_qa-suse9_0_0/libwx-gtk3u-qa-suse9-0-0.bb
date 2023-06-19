SUMMARY = "wxWidgets quality assurance class library"
DESCRIPTION = "This is the library containing extra classes for quality \
assurance, containing the wxDebugReport class. wxDebugReport is \
used to generate a debug report, containing information about the \
program current state."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk3u_qa-suse9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "49db112a176a583d3e4fa85d1c6a6c054220b4b527d604f7acc5f3392d371e8b3abfb48d7aef29de787f64d4b1c81d054d5e067d0d463ebc42f48a9f59fe5e9e"

RPROVIDES:${PN} += "libwx-gtk3u-qa-suse.so.9.0.0 \
libwx-gtk3u-qa-suse9-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwx-baseu-suse.so.9.0.0 \
libwx-baseu-xml-suse.so.9.0.0 \
libwx-gtk3u-core-suse.so.9.0.0"

inherit rpm
