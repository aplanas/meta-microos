SUMMARY = "Headers and sources for developing software using davix"
DESCRIPTION = "This package provides the headers and sources needed for developing \
applications using davix."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.4"

RPM_NAME = "davix-devel-0.8.4-1.3.aarch64.rpm"
RPM_HASH = "04baaac581a048d1c3a989710ad9d076602d61cfbe375f97b77cb1050c2eda90b8b7b51b1601db17301978968456766a2f8a283c4c154f52fb786922bb9e22bd"

RPROVIDES:${PN} += "davix-devel \
davix-devel(aarch-64) \
pkgconfig(davix)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdavix0"

inherit rpm
