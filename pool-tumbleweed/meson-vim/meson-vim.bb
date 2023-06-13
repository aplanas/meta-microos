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

PV = "1.1.0"

RPM_NAME = "meson-vim-1.1.0-2.1.noarch.rpm"
RPM_HASH = "9a847591cf2d7fbb0a4ba3feb601217dae7eea9df8d007c059982e90886be5d47289f70833cd0c4f8387b819f68613d3a010cd0afa74b346fd99261685f1697b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "meson-vim"

RDEPENDS:${PN} += "vim"

inherit rpm
