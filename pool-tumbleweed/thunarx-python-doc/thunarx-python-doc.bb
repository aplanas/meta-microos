SUMMARY = "Documentation for thunarx-python"
DESCRIPTION = "This package provides the documentation files for python thunarx."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.2"

RPM_NAME = "thunarx-python-doc-0.5.2-1.13.aarch64.rpm"
RPM_HASH = "598271cbeb07e373b76381d882022cb772e3928225e83c0177ebf2208aa769ef42dd750dab159298cda7328e7dfbc662b5afd93b8e1bf4713a8a8450247bc8ee"

RPROVIDES:${PN} += "thunarx-python-doc"

RDEPENDS:${PN} += ""

inherit rpm
