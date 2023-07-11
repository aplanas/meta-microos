SUMMARY = "Development files for uhd"
DESCRIPTION = "The UHD is the 'Universal Software Radio Peripheral' hardware driver. \
The goal of the UHD is to provide a host driver and API for current \
and future Ettus Research products. Users will be able to use the \
UHD driver standalone or with 3rd party applications. \
 \
This package contains all the necessary tools, examples and include \
files for development with the UHD Driver."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.0.0"

RPM_NAME = "uhd-devel-4.4.0.0-1.5.aarch64.rpm"
RPM_HASH = "2c14c9c4e3bb450c4fb3351fc58350ae73efa1791e9f82db262da34fb97330cc53cd7c7e601a7f115e2c4203133ff47a40507e86de52edb8b6376911ce52047a"

RPROVIDES:${PN} += "cmake-UHD \
pkgconfig-uhd \
uhd-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libboost-filesystem-devel \
libboost-program-options-devel \
libboost-regex-devel \
libboost-serialization-devel \
libboost-test-devel \
libboost-thread-devel \
libuhd4-4-0"

inherit rpm
