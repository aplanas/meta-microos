SUMMARY = "Development headers for Boost.TypeErasure library"
DESCRIPTION = "This package contains development headers for Boost.TypeErasure library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_type_erasure1_82_0-devel-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "07b7e297790ccb3df4c53a5384ff79c18aa342e01393afe7082c885d38e75adc7e285e014be0e4604762ca56b466ec94686f1a504e32f82cc563988a389c6e68"

RPROVIDES:${PN} += "libboost-type-erasure-devel-impl \
libboost-type-erasure1-82-0-devel"

RDEPENDS:${PN} += "libboost-chrono1-82-0-devel \
libboost-headers1-82-0-devel \
libboost-system1-82-0-devel \
libboost-thread1-82-0-devel \
libboost-type-erasure1-82-0"

inherit rpm
