SUMMARY = "Berkeley Logo interpreter"
DESCRIPTION = "Berkeley Logo interpreter is a free (both senses) interpreter for the Logo \
programming language."
LICENSE = "GPL-3.0-or-later"

PV = "6.2.4"

RPM_NAME = "ucblogo-6.2.4-1.2.aarch64.rpm"
RPM_HASH = "3de633b646ee05d99d01d4c85f721ff43f1b45758cb3fde85a1008a5f40d1f71c557ad5dd503c35ac26610d7b48a657a308aeb5e31fd3e61df9e52e0fa5a1909"

RPROVIDES:${PN} += "application() \
application(ucblogo.desktop) \
ucblogo \
ucblogo(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libwx_baseu-suse.so.9.0.0()(64bit) \
libwx_gtk3u_core-suse.so.9.0.0()(64bit) \
libwx_gtk3u_html-suse.so.9.0.0()(64bit)"

inherit rpm
