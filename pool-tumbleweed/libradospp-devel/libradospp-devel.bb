SUMMARY = "RADOS headers"
DESCRIPTION = "This package contains C++ libraries and headers needed to develop programs \
that use RADOS object store."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "libradospp-devel-16.2.13.66+g54799ee0666-4.1.aarch64.rpm"
RPM_HASH = "dc2790c216b52d6bd9b2509e76ef65886c81ea24b687f2168b59cebe5c8704b7ecc7032fb76ec3c4243e2efb6ad39f01b7613d61b07531112e427f20b46ed6d8"

RPROVIDES:${PN} += "libradospp-devel"

RDEPENDS:${PN} += "librados-devel \
librados2"

inherit rpm
