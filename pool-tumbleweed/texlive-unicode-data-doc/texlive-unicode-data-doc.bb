SUMMARY = "Documentation for texlive-unicode-data"
DESCRIPTION = "This package includes the documentation for texlive-unicode-data"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.16svn64423"

RPM_NAME = "texlive-unicode-data-doc-2023.209.1.16svn64423-54.1.noarch.rpm"
RPM_HASH = "d3cb07756e541a7769dcbf09de3b39cc88b93cd6afb6a9ac5c1a3ddbb65a34efa7860e55f8638836841468a00d87f43a1ab9a58758accbacfbd74ef279e6cafc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unicode-data-doc"

RDEPENDS:${PN} += ""

inherit rpm
