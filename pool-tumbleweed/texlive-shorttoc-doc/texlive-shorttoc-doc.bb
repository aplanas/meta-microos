SUMMARY = "Documentation for texlive-shorttoc"
DESCRIPTION = "This package includes the documentation for texlive-shorttoc"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn15878"

RPM_NAME = "texlive-shorttoc-doc-2023.209.1.3svn15878-54.1.noarch.rpm"
RPM_HASH = "b9a106652e008ada5199d7b2ded6c5fa9cc0d9cd8a2a2916d5892be1be914e04bf4497a4f161ac216bdde07316c98061ca8d20e60490a842cc3027039492d4d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-shorttoc-doc"

RDEPENDS:${PN} += ""

inherit rpm
