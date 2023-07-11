SUMMARY = "RADOS headers"
DESCRIPTION = "This package contains C++ libraries and headers needed to develop programs \
that use RADOS object store."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "libradospp-devel-16.2.13.66+g54799ee0666-3.1.aarch64.rpm"
RPM_HASH = "1d9717841e62ac202c2f5c97640cf8da1b40146ed616ff06116834ec6e86ac7ce0fb346ccb023d0554e87d2c19f504c46e1baf6e3c07a3fdb4a3412001a1ad1e"

RPROVIDES:${PN} += "libradospp-devel"

RDEPENDS:${PN} += "librados-devel \
librados2"

inherit rpm
