SUMMARY = "Python-based build system"
DESCRIPTION = "Meson is a build system designed to optimise programmer productivity. \
It aims to do this by providing support for software development \
tools and practices, such as unit tests, coverage reports, Valgrind, \
CCache and the like. Supported languages include C, C++, Fortran, \
Java, Rust. Build definitions are written in a non-turing complete \
Domain Specific Language."
LICENSE = "Apache-2.0"

PV = "1.2.1"

RPM_NAME = "meson-1.2.1-1.1.noarch.rpm"
RPM_HASH = "cfeba50d9994a910b90fb7aeec4bf5a3343bbe02d005d738dbcd75b5fb3cadf6547e138e8f66da4a7276f22aaa21ce06e605b1fcf1b5a4677f14fdbd34ba5539"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "meson \
meson-gui \
python3.11dist-meson \
python3dist-meson \
rpm-macro-meson \
rpm-macro-meson-build \
rpm-macro-meson-install \
rpm-macro-meson-test"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
ninja \
python-abi"

inherit rpm
