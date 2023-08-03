SUMMARY = "Documentation for texlive-ddphonism"
DESCRIPTION = "This package includes the documentation for texlive-ddphonism"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn52009"

RPM_NAME = "texlive-ddphonism-doc-2023.209.0.0.2svn52009-53.1.noarch.rpm"
RPM_HASH = "d2241229ca94ddeb1c6614053de2877bf176430d548dc6352e23458b3ef2c8ea068a64eb5987e15aa1ad3183e9f3f43120798f790f2e96a6b33b76c0ded4373a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ddphonism-doc"

RDEPENDS:${PN} += ""

inherit rpm
