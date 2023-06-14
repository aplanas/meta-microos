SUMMARY = "Development files for EditorConfig core library written in C"
DESCRIPTION = " \
EditorConfig makes it easy to maintain the correct coding style when switching \
between different text editors and between different projects. The EditorConfig \
project maintains a file format and plugins for various text editors which allow \
this file format to be read and used by those editors. For information on the \
file format and supported text editors, see the EditorConfig website. \
 \
This package contains files for developing and building with editorconfig-core-c"
LICENSE = "BSD-2-Clause & BSD-3-Clause"

PV = "0.12.6"

RPM_NAME = "libeditorconfig-devel-0.12.6-1.1.aarch64.rpm"
RPM_HASH = "14125f71e8de699b2727c3a78a8ec4dd09286c3591fec12823ff535e1b033c3e327b64befc93b016d2b5f1f6e20bb24a2af36788c2035e3546c8491117fee416"

RPROVIDES:${PN} += "cmake-EditorConfig \
libeditorconfig-devel \
pkgconfig-editorconfig"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libeditorconfig0"

inherit rpm
