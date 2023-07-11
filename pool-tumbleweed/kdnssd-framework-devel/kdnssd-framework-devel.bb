SUMMARY = "Network service discovery using Zeroconf"
DESCRIPTION = "KDNSSD is a library for handling the DNS-based Service Discovery Protocol \
(DNS-SD), the layer of Zeroconf that allows network \
services, such as printers, to be discovered without any user intervention or \
centralized infrastructure. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "kdnssd-framework-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "d720d9ea522c30ca96cdc6a8116d9befa76c16c131446a82dff94c163129628e4b06f7e60ccdb3d91c24387efeaeb5bc4549edf09e20b562fe063a998c73f8ab"

RPROVIDES:${PN} += "cmake-KF5DNSSD \
kdnssd-framework-devel"

RDEPENDS:${PN} += "cmake-Qt5Network \
extra-cmake-modules \
libKF5DNSSD5"

inherit rpm
