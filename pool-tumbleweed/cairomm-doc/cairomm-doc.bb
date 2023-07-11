SUMMARY = "Documentation for the Cairo C++ interface"
DESCRIPTION = "This package provides documentation for the Cairo C++ interface."
LICENSE = "LGPL-2.1-or-later"

PV = "1.16.1"

RPM_NAME = "cairomm-doc-1.16.1-2.4.aarch64.rpm"
RPM_HASH = "d45205d1d214f9bb8cc8628b6309fb2e79a4572e25d900758e5585a6d20bfe92ec103796773ccf8cdc9ca16e443b231edc114135451c176e609bc61c6686064d"

RPROVIDES:${PN} += "cairomm-doc"

RDEPENDS:${PN} += ""

inherit rpm
