SUMMARY = "A collection of utilities and DSOs to handle compiled objects"
DESCRIPTION = "This package contains the headers and libraries needed to build \
applications that require libasm."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "libasm-devel-0.189-5.1.aarch64.rpm"
RPM_HASH = "48a820d4f3cf79d5aeb631092796b2733bc37b35344a9ac4efe4d2118a345591f7221805d52c08b29ad1ac2f186ca54f412efe8e4931b8abf67e6c9a08f95b84"

RPROVIDES:${PN} += "libasm-devel"

RDEPENDS:${PN} += "glibc-devel \
libasm1"

inherit rpm
