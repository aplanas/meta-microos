SUMMARY = "Documentation for texlive-twoup"
DESCRIPTION = "This package includes the documentation for texlive-twoup"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn15878"

RPM_NAME = "texlive-twoup-doc-2023.209.1.3svn15878-53.1.noarch.rpm"
RPM_HASH = "58e6ba79ff6fe6239ca0a7a62dab8cf60fef67ce5efd16ae6882462befabc3b312746c63a65bcb8683ea32c493ecdee111c98c1d32eea0e0a8a2def08af11d39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-twoup-doc"

RDEPENDS:${PN} += ""

inherit rpm
