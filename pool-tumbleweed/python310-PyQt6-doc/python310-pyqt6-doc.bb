SUMMARY = "Examples for python310-PyQt6"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework. \
 \
This package contains programming examples for PyQt6."
LICENSE = "GPL-3.0-only | SUSE-GPL-2.0-with-FLOSS-exception | NonFree"

PV = "6.5.1"

RPM_NAME = "python310-PyQt6-doc-6.5.1-1.2.noarch.rpm"
RPM_HASH = "314cb15c3712e7105d078517d2d07f622ecd062f002b66fc50fa13d89fe0c3aac01d17e3ab2611bcffd7b4f0a8150a28118c00400ce1c7088279750d3f93fb02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-PyQt6-doc \
python310-qt6-doc"

RDEPENDS:${PN} += ""

inherit rpm
