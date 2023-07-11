SUMMARY = "Documentation for Pyramid exceptions logger"
DESCRIPTION = "This package contains documentation for python-peppercorn."
LICENSE = "BSD-4-Clause & ZPL-2.1 & MIT"

PV = "0.6"

RPM_NAME = "python-peppercorn-doc-0.6-4.3.noarch.rpm"
RPM_HASH = "da53a7ab0d6700947d97c041aa4d310479a6ed8555ca53396cef2ce381bde6f8833090a981e1ddac43bf15eadcf512e8cb9669fd4d2607bc46dccb3d28314d49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-peppercorn-doc"

RDEPENDS:${PN} += ""

inherit rpm
