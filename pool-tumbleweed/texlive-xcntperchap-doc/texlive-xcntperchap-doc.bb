SUMMARY = "Documentation for texlive-xcntperchap"
DESCRIPTION = "This package includes the documentation for texlive-xcntperchap"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5svn54080"

RPM_NAME = "texlive-xcntperchap-doc-2023.201.0.0.5svn54080-52.2.noarch.rpm"
RPM_HASH = "fc35c4f9287e1abdff1df3892bf485a8c3b1b7335f3a87ed2eb394d2b487f09b0d67f80e88a494fff00b6e19fc05d9d814cfd34d7bbf474237a79d79006693fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xcntperchap-doc"

RDEPENDS:${PN} += ""

inherit rpm
