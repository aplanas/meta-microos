SUMMARY = "Development files for libnvme"
DESCRIPTION = "The libnvme-devel package contains libraries and header files for \
developing applications that use libnvme."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4"

RPM_NAME = "libnvme-devel-1.4-1.1.aarch64.rpm"
RPM_HASH = "b222a798d234c39f652b3e1594eae4b8173100b338a4efd66e2f40efedc77eb40992843fa809de51e925b7f54fe86b0d35453c54ecbf8560a3cf38dac333c6f1"

RPROVIDES:${PN} += "libnvme-devel \
libnvme-devel(aarch-64) \
pkgconfig(libnvme) \
pkgconfig(libnvme-mi)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnvme-mi1 \
libnvme1 \
pkgconfig(json-c) \
pkgconfig(libkeyutils) \
pkgconfig(openssl)"

inherit rpm
