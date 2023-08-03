SUMMARY = "Python-based build system"
DESCRIPTION = "Meson is a build system designed to optimise programmer productivity. \
It aims to do this by providing support for software development \
tools and practices, such as unit tests, coverage reports, Valgrind, \
CCache and the like. Supported languages include C, C++, Fortran, \
Java, Rust. Build definitions are written in a non-turing complete \
Domain Specific Language."
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "meson-1.2.0-1.1.noarch.rpm"
RPM_HASH = "69ef62693e6e5926b06bd3e9002fa80f0381c7cc117f0c157147613299ddd234588537e43b3b91a952a1b0e126e24e8196055d4169ea919590407b70fe466615"
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
