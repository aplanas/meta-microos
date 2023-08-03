SUMMARY = "Documentation and examples for the Qore yaml module"
DESCRIPTION = "This package contains the HTML documentation and example programs for the Qore \
yaml module."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later | MIT"

PV = "0.7.3"

RPM_NAME = "qore-yaml-module-doc-0.7.3-2.1.noarch.rpm"
RPM_HASH = "13b8803ac2b7afac5eb9a4fb3d359a2baaaf723125ff76d990a186ddc4b3f00d074bf16cc6d8aee06c3d1636d5b667c584f27248f810d55b2d27b8cf560e9d1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qore-yaml-module-doc"

RDEPENDS:${PN} += ""

inherit rpm
