SUMMARY = "Library for KDE Education Applications: Build Environment"
DESCRIPTION = "This package contains all necessary files and libraries needed to \
develop KDE education applications."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "libkeduvocdocument-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "b0909e306136bebafd58448c6dd583c334fe41492cce762d06addbb74ed7cc079021d449a2888a436a1754e12585253093e126a65d8936d1db8809cdd62af832"

RPROVIDES:${PN} += "cmake-LibKEduVocDocument \
libkeduvocdocument-devel"

RDEPENDS:${PN} += "libKEduVocDocument5"

inherit rpm
