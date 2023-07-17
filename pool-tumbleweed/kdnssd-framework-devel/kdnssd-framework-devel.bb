SUMMARY = "Network service discovery using Zeroconf"
DESCRIPTION = "KDNSSD is a library for handling the DNS-based Service Discovery Protocol \
(DNS-SD), the layer of Zeroconf that allows network \
services, such as printers, to be discovered without any user intervention or \
centralized infrastructure. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "kdnssd-framework-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "dea5490c927784d961f65b157d6ff409149de2cb3181bb26e71a5fb7e34b7c97cd0cccc7fa3c044ee4210ac2f707641d79107d8fab0319d4f72555599dde0f79"

RPROVIDES:${PN} += "cmake-KF5DNSSD \
kdnssd-framework-devel"

RDEPENDS:${PN} += "cmake-Qt5Network \
extra-cmake-modules \
libKF5DNSSD5"

inherit rpm
