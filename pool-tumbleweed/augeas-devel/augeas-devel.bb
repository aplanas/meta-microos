SUMMARY = "A library for changing configuration files"
DESCRIPTION = "A library for programmatically editing configuration files. Augeas \
parses configuration files into a tree structure, which it exposes \
through its public API. Changes made through the API are written back \
to the initially read files."
LICENSE = "LGPL-2.1-or-later"

PV = "1.13.0"

RPM_NAME = "augeas-devel-1.13.0-2.2.aarch64.rpm"
RPM_HASH = "6c25a9cb79fedf95f41cbd8b584b9cc58c13cc7d8708b5ce4d5a8910057127adb205925a26923e77f437496cdb5ff45434b38a64e73cf922999a9257f6019962"

RPROVIDES:${PN} += "augeas-devel \
pkgconfig-augeas"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libaugeas0 \
libfa1 \
pkgconfig-libxml-2.0"

inherit rpm
