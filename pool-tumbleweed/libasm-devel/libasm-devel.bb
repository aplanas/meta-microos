SUMMARY = "A collection of utilities and DSOs to handle compiled objects"
DESCRIPTION = "This package contains the headers and libraries needed to build \
applications that require libasm."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "libasm-devel-0.189-3.3.aarch64.rpm"
RPM_HASH = "14feb75ff8a6827adb75153b0524d63b33e0eb3389c4596e4addf8458fafa849f486fe04f81991d0619ce4d4de942de0ac02225e10f3e37c2e320e09dbe81485"

RPROVIDES:${PN} += "libasm-devel"

RDEPENDS:${PN} += "glibc-devel \
libasm1"

inherit rpm
