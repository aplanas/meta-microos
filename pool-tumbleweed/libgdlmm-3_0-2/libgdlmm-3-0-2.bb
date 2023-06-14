SUMMARY = "C++ interface for gdl"
DESCRIPTION = "gdlmm provides a C++ interface to the gdl library."
LICENSE = "LGPL-2.1-or-later"

PV = "3.7.3"

RPM_NAME = "libgdlmm-3_0-2-3.7.3-8.22.aarch64.rpm"
RPM_HASH = "4c927491eca52ff3365793ff20885c884343712a0fd31199a7125f147f8be4837f535a3a27db7f8fb5d8f6eb23a23fd2856fa22784dca2b7cf94e1c47cd97cf6"

RPROVIDES:${PN} += "libgdlmm-3-0-2 \
libgdlmm-3.0.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libatkmm-1.6.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdkmm-3.0.so.1 \
libgdl-3.so.5 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtkmm-3.0.so.1 \
libsigc-2.0.so.0 \
libstdc++.so.6"

inherit rpm
