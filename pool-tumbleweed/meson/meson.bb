SUMMARY = "Python-based build system"
DESCRIPTION = "Meson is a build system designed to optimise programmer productivity. \
It aims to do this by providing support for software development \
tools and practices, such as unit tests, coverage reports, Valgrind, \
CCache and the like. Supported languages include C, C++, Fortran, \
Java, Rust. Build definitions are written in a non-turing complete \
Domain Specific Language."
LICENSE = "Apache-2.0"

PV = "1.1.1"

RPM_NAME = "meson-1.1.1-1.4.noarch.rpm"
RPM_HASH = "7fe4caf8bf6e4ee1c729b57c69028b93119ebcb04fd45995b7c7a268215663c67ea1ec368fc83b59acca102a339484fcea09664d7ba319cee11e0fc11178f33e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "meson \
meson-gui \
python3.11dist-meson \
python3dist-meson \
rpm-macro-meson \
rpm-macro-meson-build \
rpm-macro-meson-install \
rpm-macro-meson-test"

RDEPENDS:${PN} += "/usr/bin/python3 \
ninja \
python-abi \
python3-base"

inherit rpm
