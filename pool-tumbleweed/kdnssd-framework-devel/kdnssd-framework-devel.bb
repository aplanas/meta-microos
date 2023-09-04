SUMMARY = "Network service discovery using Zeroconf"
DESCRIPTION = "KDNSSD is a library for handling the DNS-based Service Discovery Protocol \
(DNS-SD), the layer of Zeroconf that allows network \
services, such as printers, to be discovered without any user intervention or \
centralized infrastructure. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kdnssd-framework-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "6eb5898af18f7300370f13ecd5d82c3f2241e117e3850667d7e01b865f9425cc2b142a19e1be1c94e3539d25d061f7c09dc32a210717e410dd34903876b9e240"

RPROVIDES:${PN} += "cmake-KF5DNSSD \
kdnssd-framework-devel"

RDEPENDS:${PN} += "cmake-Qt5Network \
extra-cmake-modules \
libKF5DNSSD5"

inherit rpm
