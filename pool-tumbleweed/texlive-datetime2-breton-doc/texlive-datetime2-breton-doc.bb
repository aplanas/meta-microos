SUMMARY = "Documentation for texlive-datetime2-breton"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-breton"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn52647"

RPM_NAME = "texlive-datetime2-breton-doc-2023.201.1.2svn52647-52.1.noarch.rpm"
RPM_HASH = "c745ecdfdf020afe5321478737775e141d7f9fcfa1988e9ecfb26734aa5e5897126bd7564c961fd63ddb7472cbfae4fdbad8492cc0f0e507410b40ed4d554ad7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-breton-doc"

RDEPENDS:${PN} += ""

inherit rpm
