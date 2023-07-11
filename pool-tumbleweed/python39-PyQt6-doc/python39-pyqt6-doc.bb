SUMMARY = "Examples for python39-PyQt6"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework. \
 \
This package contains programming examples for PyQt6."
LICENSE = "GPL-3.0-only | SUSE-GPL-2.0-with-FLOSS-exception | NonFree"

PV = "6.5.0"

RPM_NAME = "python39-PyQt6-doc-6.5.0-2.2.noarch.rpm"
RPM_HASH = "447a106f48349e1c9da09193dcd1a00fc44f361b180813920a886cb8d3c1d50c8505f7a7e6302b174c216f181381a85e8bbaf3e3628268ac5b18a0b2ea67fb42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-PyQt6-doc \
python39-qt6-doc"

RDEPENDS:${PN} += ""

inherit rpm
