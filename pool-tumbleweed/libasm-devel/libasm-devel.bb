SUMMARY = "A collection of utilities and DSOs to handle compiled objects"
DESCRIPTION = "This package contains the headers and libraries needed to build \
applications that require libasm."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "libasm-devel-0.189-4.1.aarch64.rpm"
RPM_HASH = "766c884cbd2e2c253da027a0e759dd811d4a3054912b3a41c0acf26bdbebac58081cbdd8c87aac07c885b7e4d66961db6567a2c394ea9bb23c2c537d1976cb81"

RPROVIDES:${PN} += "libasm-devel"

RDEPENDS:${PN} += "glibc-devel \
libasm1"

inherit rpm
