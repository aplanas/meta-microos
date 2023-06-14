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

RPM_NAME = "uhd-devel-4.4.0.0-1.4.aarch64.rpm"
RPM_HASH = "07fd0a79b57dc9cd0ea3414d1723de6dcad22322abb9550849f3e19f5834071224c21830e77a5760a78b445a3c7690b1e0a4d5337a85248543c443969b392406"

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
