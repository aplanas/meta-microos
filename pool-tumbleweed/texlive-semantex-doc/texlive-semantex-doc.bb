SUMMARY = "Documentation for texlive-semantex"
DESCRIPTION = "This package includes the documentation for texlive-semantex"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.525svn65679"

RPM_NAME = "texlive-semantex-doc-2023.209.0.0.525svn65679-54.1.noarch.rpm"
RPM_HASH = "07a6afe9d27915cd0581b32bcc2afea7af6f43120172965a1ebb65b9eedcf65e843f353dba051206185503833ff60c173460f66406754845c25c82faa0cff335"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-semantex-doc"

RDEPENDS:${PN} += ""

inherit rpm
