SUMMARY = "Documentation for texlive-euro-ce"
DESCRIPTION = "This package includes the documentation for texlive-euro-ce"
LICENSE = "BSD-3-Clause"

PV = "2023.201.3.0bsvn25714"

RPM_NAME = "texlive-euro-ce-doc-2023.201.3.0bsvn25714-52.1.noarch.rpm"
RPM_HASH = "534340122b740fc5f9fe967d7ca535033b0f2ea6e2eba02097ab2cc591aa2e03480d34650f21fe6791b8706ea9a980f05012c2e7be565c87aac4a10c6f1f7b3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-euro-ce-doc"
RDEPENDS:${PN} += ""

inherit rpm
