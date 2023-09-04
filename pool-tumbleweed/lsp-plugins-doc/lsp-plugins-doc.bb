SUMMARY = "Linux Studio Plugins Documentation"
DESCRIPTION = "Documentation for Linux Studio Plugins Project"
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.10"

RPM_NAME = "lsp-plugins-doc-1.2.10-1.1.noarch.rpm"
RPM_HASH = "34cb603de1addcd6e1b223be0d361d97309524dd42bbe17380d8dc571a2ae2b759c7d4d30ad2e3cdca76f66760f1091b423a9d335ec6b3dac9017d082aa56aee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lsp-plugins-doc"

RDEPENDS:${PN} += ""

inherit rpm
