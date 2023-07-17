SUMMARY = "Header files for kcodecs, a method collection for string manipulation"
DESCRIPTION = "Development files for KCodecs, a method collection to manipulate \
strings using various encodings."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "kcodecs-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "0df60e6acad03b51cad91fc8d84ac563ea4ed1df7564ec0cc48b540923a6e30e3e3ce451b99636b03aebdd2e5486852439e4605d20b61b6c4df8c26f110ef050"

RPROVIDES:${PN} += "cmake-KF5Codecs \
kcodecs-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
extra-cmake-modules \
libKF5Codecs5"

inherit rpm
