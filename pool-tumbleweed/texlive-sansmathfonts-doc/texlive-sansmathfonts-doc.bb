SUMMARY = "Documentation for texlive-sansmathfonts"
DESCRIPTION = "This package includes the documentation for texlive-sansmathfonts"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn64661"

RPM_NAME = "texlive-sansmathfonts-doc-2023.201.svn64661-53.1.noarch.rpm"
RPM_HASH = "cd31421b7f6b4ec7a81190ac76a55607690fc16b8ef367c4e5d6ee7e57864cf39bf1a45ae1d7a4957617c3ff2519d39591de157f5884b5f976e600d5bf757445"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sansmathfonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
