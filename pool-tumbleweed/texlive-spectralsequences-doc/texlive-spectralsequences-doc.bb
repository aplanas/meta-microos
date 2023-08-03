SUMMARY = "Documentation for texlive-spectralsequences"
DESCRIPTION = "This package includes the documentation for texlive-spectralsequences"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3.3svn65667"

RPM_NAME = "texlive-spectralsequences-doc-2023.209.1.3.3svn65667-58.1.noarch.rpm"
RPM_HASH = "d8c83aa5d1c9eebe946989df8596f16bc9385ee4cc8b097e4bb4a1a89874563b55810d113b18315eb6dd1b1d03796fe56a4bd01c6d34d7c6b8756e0ce331d77d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-spectralsequences-doc"

RDEPENDS:${PN} += ""

inherit rpm
