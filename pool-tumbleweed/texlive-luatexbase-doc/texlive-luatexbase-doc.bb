SUMMARY = "Documentation for texlive-luatexbase"
DESCRIPTION = "This package includes the documentation for texlive-luatexbase"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.3svn52663"

RPM_NAME = "texlive-luatexbase-doc-2023.208.1.3svn52663-53.1.noarch.rpm"
RPM_HASH = "4475a00cee592063beff3b95b44818a757812c4657d519e2b0fdb8e0fbece915bdec43dcf261783370ba65e0ffa797ea43dbe40671e62796fbbc70119802e495"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luatexbase-doc"

RDEPENDS:${PN} += ""

inherit rpm
