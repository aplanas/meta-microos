SUMMARY = "Development package for Boost C++"
DESCRIPTION = "This package contains all that is needed to develop/compile \
applications that use the Boost C++ libraries. For documentation see \
the documentation packages (html, man or pdf)."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost_1_82_0-gnu-openmpi4-hpc-devel-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "910d769d48f6d99cfc862658ff17d93bbcd3c0c5e62377b5deaab639905e878ae3f97afc3ddd2e4a5d47068fb54eaad8119633355fe67232e6a1227208e239ab"

RPROVIDES:${PN} += "boost-1-82-0-gnu-openmpi4-hpc-devel"

RDEPENDS:${PN} += "boost-1-82-0-gnu-openmpi4-hpc \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
