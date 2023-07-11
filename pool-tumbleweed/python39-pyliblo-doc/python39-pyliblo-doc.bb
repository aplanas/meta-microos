SUMMARY = "Documentation for python-pyliblo"
DESCRIPTION = "This package contains HTML documentation, including tutorials and API \
reference for python-pyliblo."
LICENSE = "LGPL-2.1-or-later"

PV = "0.10.0"

RPM_NAME = "python39-pyliblo-doc-0.10.0-2.12.aarch64.rpm"
RPM_HASH = "92a155d4b1f628c21772c362fbd42caa9d7a08fc65463c15d0dc6569de5f3e42d75584421e60a9e3302371d015d135b3c3e7cdae31d35336ef3d0a47978760c3"

RPROVIDES:${PN} += "python39-pyliblo-doc"

RDEPENDS:${PN} += "python39-pyliblo"

inherit rpm
