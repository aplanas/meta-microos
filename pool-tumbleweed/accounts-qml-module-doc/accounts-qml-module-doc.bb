SUMMARY = "Documentation for accounts-qml-module"
DESCRIPTION = "This package contains the developer documentation for accounts-qml-module."
LICENSE = "LGPL-2.1-only"

PV = "0.7"

RPM_NAME = "accounts-qml-module-doc-0.7-2.14.noarch.rpm"
RPM_HASH = "b68c80b18c40a039b2fb8a1a5d35f7ed7151bfd0cc93a01957ade2e0a997c4d9dcc295d993c6584e03bd8ee2b18275be84208391ecb2ab6bf1023d0c7ea46821"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "accounts-qml-module-doc"

RDEPENDS:${PN} += ""

inherit rpm
