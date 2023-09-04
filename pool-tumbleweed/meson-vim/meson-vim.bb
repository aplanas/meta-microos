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

PV = "1.2.1"

RPM_NAME = "meson-vim-1.2.1-1.1.noarch.rpm"
RPM_HASH = "0da1b76ad5fe54a7858855d01e5ef686ae4ee594c658833f090813a11de26b59fa345a276dcdf83304201a82d0957ea3fe7abb2cd2e1beb3ced4e0b8cd25e62f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "meson-vim"

RDEPENDS:${PN} += "vim"

inherit rpm
