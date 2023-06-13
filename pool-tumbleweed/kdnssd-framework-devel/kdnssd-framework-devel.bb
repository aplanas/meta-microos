SUMMARY = "Network service discovery using Zeroconf"
DESCRIPTION = "KDNSSD is a library for handling the DNS-based Service Discovery Protocol \
(DNS-SD), the layer of Zeroconf that allows network \
services, such as printers, to be discovered without any user intervention or \
centralized infrastructure. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kdnssd-framework-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "a53d5c2d71a60b1c908f5db277b20e803adc859dd82059b28224739ffe82fc6a921fb032009800202b749995130ef35e982f86efaf9a08e7f143e7d319b0d9c7"

RPROVIDES:${PN} += "cmake(KF5DNSSD) \
kdnssd-framework-devel \
kdnssd-framework-devel(aarch-64)"

RDEPENDS:${PN} += "cmake(Qt5Network) \
extra-cmake-modules \
libKF5DNSSD5"

inherit rpm
