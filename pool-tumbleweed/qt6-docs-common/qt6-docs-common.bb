SUMMARY = "Common files for building documentation"
DESCRIPTION = "This package contains common files used for building Qt documentation."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-docs-common-6.5.2-2.1.noarch.rpm"
RPM_HASH = "94b4e0c62ee72a33feda964cdca0ea5a57f9f9558dfa82567fd223fd752471dccd3d27d33c5db64fc42835de4b8529d62a7da11b5373a3edb8c16690f4fb875c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qt6-docs-common"

RDEPENDS:${PN} += ""

inherit rpm
