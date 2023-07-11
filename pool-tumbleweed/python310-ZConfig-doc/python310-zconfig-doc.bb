SUMMARY = "Structured Configuration Library"
DESCRIPTION = "This package contains documentation files for python310-ZConfig."
LICENSE = "ZPL-2.1"

PV = "3.6.1"

RPM_NAME = "python310-ZConfig-doc-3.6.1-1.5.noarch.rpm"
RPM_HASH = "36942ddace1b8473da9c2fd1c7c27453a4dc01d8a94a9316a737149637c4df5432c064245c26e70d27cc2e7fa74cf088b9b1e810411ef75769ed85b9067e4daf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-ZConfig-doc"

RDEPENDS:${PN} += "python310-ZConfig"

inherit rpm
