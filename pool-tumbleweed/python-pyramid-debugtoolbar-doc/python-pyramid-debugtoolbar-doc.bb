SUMMARY = "Documentation files for python-pyramid-debugtoolbar"
DESCRIPTION = "Documentation and examples for python-pyramid-debugtoolbar."
LICENSE = "BSD-4-Clause & ZPL-2.1 & MIT"

PV = "4.10"

RPM_NAME = "python-pyramid-debugtoolbar-doc-4.10-1.3.noarch.rpm"
RPM_HASH = "f644d472804fec2d90cebf11bc2c9e8bda5ef7ab8e4e88b25fbc9fd992040425c16293bc086c67ccdb85e6361698fec84db13930216440c1a295c4312a00cd78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-pyramid-debugtoolbar-doc"
RDEPENDS:${PN} += ""

inherit rpm
