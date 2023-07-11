SUMMARY = "Documentation for accounts-qml-module"
DESCRIPTION = "This package contains the developer documentation for accounts-qml-module."
LICENSE = "LGPL-2.1-only"

PV = "0.7"

RPM_NAME = "accounts-qml-module-doc-0.7-2.15.noarch.rpm"
RPM_HASH = "77a298672dbd366c40bf8de11f736b9a15c810c01cb7785a81aabeffbc2a88c2930a10807271294089d431e6f101a5673f166a476441b5cc773ba8646e54339b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "accounts-qml-module-doc"

RDEPENDS:${PN} += ""

inherit rpm
