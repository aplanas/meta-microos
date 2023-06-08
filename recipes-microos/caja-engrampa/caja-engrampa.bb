SUMMARY = "MATE Desktop engrampa plugin for caja"
DESCRIPTION = "Engrampa is an archive manager for the MATE Desktop Environment. \
This means that you can create and modify archives; view the \
content of an archive; view and modify a file contained in the \
archive; extract files from the archive."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.26.0"

RPM_NAME = "caja-engrampa-1.26.0-1.9.aarch64.rpm"
RPM_HASH = "f4ed0f50bbf0390535b2072d7779bfdd878721c17e6db17d9d66129551d95d68dd37a003609f0a41a1857d00f4901e4367112c80e9db87161edd2a944ae8afe1"

RPROVIDES:${PN} += "caja-engrampa caja-engrampa(aarch-64) libcaja-engrampa.so()(64bit) mate-file-manager-engrampa"
RDEPENDS:${PN} += "engrampa libc.so.6(GLIBC_2.17)(64bit) libcaja-extension.so.1()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit)"

inherit rpm
