SUMMARY = "Python-based build system"
DESCRIPTION = "Meson is a build system designed to optimise programmer productivity. \
It aims to do this by providing support for software development \
tools and practices, such as unit tests, coverage reports, Valgrind, \
CCache and the like. Supported languages include C, C++, Fortran, \
Java, Rust. Build definitions are written in a non-turing complete \
Domain Specific Language."
LICENSE = "Apache-2.0"

PV = "1.1.1"

RPM_NAME = "meson-1.1.1-2.1.noarch.rpm"
RPM_HASH = "be636183a423fcb89a39044df7442c74d2681bbc33ae8d22644dde7d2092e4539b71de72072a98ecaf9e70b0223f52a7e7df1c32ef22d954ac3d6f86c98ed710"
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
