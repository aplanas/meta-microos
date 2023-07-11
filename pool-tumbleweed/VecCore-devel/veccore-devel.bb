SUMMARY = "Headers and cmake modules for VecCore"
DESCRIPTION = "VecCore is a simple abstraction layer on top of other vectorization libraries. \
 \
This package provides the headers and cmake modules for VecCore."
LICENSE = "Apache-2.0"

PV = "0.8.1"

RPM_NAME = "VecCore-devel-0.8.1-1.1.aarch64.rpm"
RPM_HASH = "97a26fef46371d320d8c60e91777be2ab9ded2408daef5eced1ec6aed85bc50669d04d75364f9f16364387d42d0e894de546a0a01dab3672807c5d69750ca7b3"

RPROVIDES:${PN} += "VecCore-devel \
cmake-VecCore"

RDEPENDS:${PN} += ""

inherit rpm
