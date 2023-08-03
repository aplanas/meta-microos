SUMMARY = "Vim syntax highlighting support for meson.build files"
DESCRIPTION = "Meson is a build system designed to optimise programmer productivity. \
It aims to do this by providing support for software development \
tools and practices, such as unit tests, coverage reports, Valgrind, \
CCache and the like. Supported languages include C, C++, Fortran, \
Java, Rust. Build definitions are written in a non-turing complete \
Domain Specific Language. \
 \
This package provides meson.build syntax highlighting support for \
Vim/NeoVim."
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "meson-vim-1.2.0-1.1.noarch.rpm"
RPM_HASH = "e114ab95a40bcf202c686e17009c768c27918deaedeb47eea6e49a3e7b04099ca363e8ce2ecea8d29878297f6cbe3b44aac0a4e4e729acea784db2df7b3bd24d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "meson-vim"

RDEPENDS:${PN} += "vim"

inherit rpm
