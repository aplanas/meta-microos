SUMMARY = "Documentation for python-pyliblo"
DESCRIPTION = "This package contains HTML documentation, including tutorials and API \
reference for python-pyliblo."
LICENSE = "LGPL-2.1-or-later"

PV = "0.10.0"

RPM_NAME = "python310-pyliblo-doc-0.10.0-2.12.aarch64.rpm"
RPM_HASH = "47c62d312ab5070ad6212bfab1813eaa58701adff1f4aa6613441fecb802bcb151e811199f980c9721cf2b9da774a07a5b818d4d4e688adcfa2db3a49a4c80a8"

RPROVIDES:${PN} += "python310-pyliblo-doc"

RDEPENDS:${PN} += "python310-pyliblo"

inherit rpm
