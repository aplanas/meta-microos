SUMMARY = "Documentation for texlive-penlight"
DESCRIPTION = "This package includes the documentation for texlive-penlight"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn64811"

RPM_NAME = "texlive-penlight-doc-2023.209.svn64811-52.1.noarch.rpm"
RPM_HASH = "b91e3a282c395e641080c822762aff91706ff5ed5e94e6818c1f4365a6d7b7fae621270c3ab8951b78b6c9b7dec6ef60ea43b415c1dd03591def6a75e29e7ed3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-penlight-doc"

RDEPENDS:${PN} += ""

inherit rpm
