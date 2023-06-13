SUMMARY = "Documentation and examples for the Qore yaml module"
DESCRIPTION = "This package contains the HTML documentation and example programs for the Qore \
yaml module."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later | MIT"

PV = "0.7.3"

RPM_NAME = "qore-yaml-module-doc-0.7.3-1.2.noarch.rpm"
RPM_HASH = "ac268058f8a4893a02eabd8d17255e14bd23f3dc8e0140df8d12d71e58bbec7e6a3a60e5c7109e9bd50624f418a720f2c0271f79c7f602725923f971e248c4c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qore-yaml-module-doc"

RDEPENDS:${PN} += ""

inherit rpm
