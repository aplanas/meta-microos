SUMMARY = "The system GNU Objective C++ Compiler"
DESCRIPTION = "The system GNU Objective C++ Compiler."
LICENSE = "GPL-3.0-or-later"

PV = "13"

RPM_NAME = "gcc-obj-c++-13-1.5.aarch64.rpm"
RPM_HASH = "5c23c444259d6d80b2f82b61fc3fa28b87b5b0d26e762d9723fb7f81160f9eacd8335f7406a1ab0520d7d612266fc7dcc3cebda16147d71ecfa50397a7e176e4"

RPROVIDES:${PN} += "gcc-obj-c++"

RDEPENDS:${PN} += "gcc-objc \
gcc13-obj-c++"

inherit rpm
