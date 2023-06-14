SUMMARY = "wxWidgets quality assurance class library"
DESCRIPTION = "This is the library containing extra classes for quality \
assurance, containing the wxDebugReport class. wxDebugReport is \
used to generate a debug report, containing information about the \
program current state."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk3u_qa-suse-nostl9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "fcbd14adcaede76db688dd69cc0b6b40da97d346b010eeb33132e1c69343048bd9fedd900fec8c824f1581a3a44e41a850164cccd6a9526f4502724d34275978"

RPROVIDES:${PN} += "libwx-gtk3u-qa-suse-nostl.so.9.0.0 \
libwx-gtk3u-qa-suse-nostl9-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwx-baseu-suse-nostl.so.9.0.0 \
libwx-baseu-xml-suse-nostl.so.9.0.0 \
libwx-gtk3u-core-suse-nostl.so.9.0.0"

inherit rpm
