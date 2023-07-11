SUMMARY = "Qt 6 Test library"
DESCRIPTION = "Qt Test is a framework for unit testing Qt based applications and \
libraries. Qt Test provides functionality commonly found in unit \
testing frameworks as well as extensions for testing graphical user \
interfaces."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "libQt6Test6-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "bc04f144242104b84e257792f92e2018b8cd0265c15cd6cfda57519d673e9e9c2499e6e3b6986c20c8c7b87c787a0d25d43b878a1e30a230528e9b03ad5958ae"

RPROVIDES:${PN} += "libQt6Test.so.6 \
libQt6Test6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Core6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
