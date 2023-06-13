SUMMARY = "Development files for KSaneCore, a Qt library for scanner hardware"
DESCRIPTION = "KSaneCore is a Qt-based interface for SANE library to control scanner hardware. \
This package contains the development files required to use KSaneCore in other \
applications."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "23.04.1"

RPM_NAME = "ksanecore-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "f6f2301c1c83ff43c2cbeb7fb3561421d19739cdfa9888d4605c7f7794c311f224612b8ebe8ae70ef972b2b1e3cff35ee34ed0a49371a87ab680121d07c0ddda"

RPROVIDES:${PN} += "cmake(KSaneCore) \
ksanecore-devel \
ksanecore-devel(aarch-64)"

RDEPENDS:${PN} += "cmake(KF5Wallet) \
cmake(KF5WidgetsAddons) \
cmake(Qt5Gui) \
libKSaneCore1 \
pkgconfig \
sane-backends-devel"

inherit rpm
