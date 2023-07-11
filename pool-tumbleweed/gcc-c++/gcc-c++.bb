SUMMARY = "The system GNU C++ Compiler"
DESCRIPTION = "The system GNU C++ Compiler."
LICENSE = "GPL-3.0-or-later"

PV = "13"

RPM_NAME = "gcc-c++-13-1.5.aarch64.rpm"
RPM_HASH = "7b98368615a5e0b4352fabd5aaa10085d0e1e3b967bbfafe99391d96f852cda50f6f3163f10837eda622f956867749d2454cc8570da7bdc9c334bc807be0d052"

RPROVIDES:${PN} += "c++-compiler \
gcc-c++"

RDEPENDS:${PN} += "gcc \
gcc13-c++"

inherit rpm
