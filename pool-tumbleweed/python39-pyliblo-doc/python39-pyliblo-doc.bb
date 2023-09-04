SUMMARY = "Documentation for python-pyliblo"
DESCRIPTION = "This package contains HTML documentation, including tutorials and API \
reference for python-pyliblo."
LICENSE = "LGPL-2.1-or-later"

PV = "0.10.0"

RPM_NAME = "python39-pyliblo-doc-0.10.0-3.1.aarch64.rpm"
RPM_HASH = "913081cd046e20f91789d8768097fbdb3d2dab69a980768526694e5bf60aac87d4057c72de3a64d54255e73daeda8c1e930260e5ad229caef3cfb86ade69062b"

RPROVIDES:${PN} += "python39-pyliblo-doc"

RDEPENDS:${PN} += "python39-pyliblo"

inherit rpm
