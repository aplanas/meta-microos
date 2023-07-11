SUMMARY = "Qt Bootstrap module"
DESCRIPTION = "Qt Bootstrap module."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5Bootstrap-devel-static-5.15.10+kde129-1.1.aarch64.rpm"
RPM_HASH = "c39055c0333da2e5bd5e6d183dce90781d11ab458950393538a54397171adc075ae27488718122a832e24c4c022b1be073cd738962ded9b46facdeb01c03cc68"

RPROVIDES:${PN} += "libQt5Bootstrap-devel-static"

RDEPENDS:${PN} += "libqt5-qtbase-common-devel"

inherit rpm
