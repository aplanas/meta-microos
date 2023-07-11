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

PV = "1.1.1"

RPM_NAME = "meson-vim-1.1.1-1.4.noarch.rpm"
RPM_HASH = "eb5f201ae457d4e39ee8c5d78aadecab76c3d3b22c3435cba5405196223cc037d6cdf0ff19744432a40602de62b8b9a8bad509e12303b47dfa8f4bf994984feb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "meson-vim"

RDEPENDS:${PN} += "vim"

inherit rpm
