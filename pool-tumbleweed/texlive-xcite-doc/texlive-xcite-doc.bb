SUMMARY = "Documentation for texlive-xcite"
DESCRIPTION = "This package includes the documentation for texlive-xcite"
LICENSE = "LPPL-1.0"

PV = "2023.209.16383.99998svn53486"

RPM_NAME = "texlive-xcite-doc-2023.209.16383.99998svn53486-53.1.noarch.rpm"
RPM_HASH = "d2b83c29b4e4891d846e68500abcbf202eb9373fa5ba917e4b92eb23a2958a5f6e77495ba8874dd791e1ad33431ec377ef2e8c4b81b68f1fad60eba76a7fb139"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xcite-doc"

RDEPENDS:${PN} += ""

inherit rpm
