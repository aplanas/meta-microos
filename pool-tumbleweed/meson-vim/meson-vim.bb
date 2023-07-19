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

RPM_NAME = "meson-vim-1.1.1-2.1.noarch.rpm"
RPM_HASH = "4f102a25315f259ae36d125a26e94c51110109c16984c273b1cdbd1dab29b79fe41871f8039733149856eb80d463463737b7ea76402238da7d6f78b77ed07ec1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "meson-vim"

RDEPENDS:${PN} += "vim"

inherit rpm
