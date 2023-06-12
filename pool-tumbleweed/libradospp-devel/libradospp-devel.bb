SUMMARY = "RADOS headers"
DESCRIPTION = "This package contains C++ libraries and headers needed to develop programs \
that use RADOS object store."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "libradospp-devel-16.2.13.66+g54799ee0666-2.1.aarch64.rpm"
RPM_HASH = "a124a2172ed254c3efa820d0b282ca2c7f6e83cffee8a560608fd60882d952ab8cdb381f85509b7cdad5aebcabfb8345fff5d74f8125c43113076ddf76888e71"

RPROVIDES:${PN} += "libradospp-devel \
libradospp-devel(aarch-64)"
RDEPENDS:${PN} += "librados-devel \
librados2"

inherit rpm
