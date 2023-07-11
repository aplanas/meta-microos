SUMMARY = "LAPACKE development files"
DESCRIPTION = "LAPACKE headers and development files."
LICENSE = "BSD-3-Clause"

PV = "3.9.0"

RPM_NAME = "lapacke-devel-3.9.0-9.2.aarch64.rpm"
RPM_HASH = "4593797aae9f55638b3ea6e26a386dad32880914f73d900298e981e43e7f5740ffabf0a71b8a5ad705803749296cacf6b735887314c1bfc0c1e04183e5d7ec0b"

RPROVIDES:${PN} += "lapacke \
lapacke-devel"

RDEPENDS:${PN} += "liblapacke3"

inherit rpm
