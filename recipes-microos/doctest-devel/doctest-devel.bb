SUMMARY = "Single-header testing framework"
DESCRIPTION = "C++98/C++11 single-header testing framework for unit tests and TDD."
LICENSE = "MIT"

PV = "2.4.11"

RPM_NAME = "doctest-devel-2.4.11-1.2.aarch64.rpm"
RPM_HASH = "17e0936b7c8836481a596102356428106c8321f1c7c5f2bc9f344511af66930938c6b098a45a523ab70b8086c7ef974e4958622f0881450ce7f68280ac9c3c72"

RPROVIDES:${PN} += "cmake(doctest) doctest-devel doctest-devel(aarch-64) pkgconfig(doctest)"
RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
