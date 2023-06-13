SUMMARY = "HTML documentation and examples for python-rtmidi"
DESCRIPTION = "Contains HTML documentation and examples for python-rtmidi."
LICENSE = "MIT"

PV = "1.4.9"

RPM_NAME = "python39-python-rtmidi-doc-1.4.9-2.4.noarch.rpm"
RPM_HASH = "d94ef1b801c9ef44c86c461fa755f219920fc05ffecd37e8e0c43061fbcf2ab2588a62f52f5f746317e27ed680fec46cad9b0496172d71123ea4f5fb8dc30dbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-python-rtmidi-doc"

RDEPENDS:${PN} += ""

inherit rpm
