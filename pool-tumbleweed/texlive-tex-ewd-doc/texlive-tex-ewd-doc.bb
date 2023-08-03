SUMMARY = "Documentation for texlive-tex-ewd"
DESCRIPTION = "This package includes the documentation for texlive-tex-ewd"
LICENSE = "BSD-3-Clause"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-tex-ewd-doc-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "410d7adcdf3e32029f1aeedfffd33e877311ad5f54bd1e4f6afda9eece57bb07ddfa61563b6f7bcf0dc3a6e0b49caea11273ba275e0367de072425897d7b257b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tex-ewd-doc"

RDEPENDS:${PN} += ""

inherit rpm
