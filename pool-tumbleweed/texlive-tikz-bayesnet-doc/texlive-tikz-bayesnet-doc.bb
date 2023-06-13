SUMMARY = "Documentation for texlive-tikz-bayesnet"
DESCRIPTION = "This package includes the documentation for texlive-tikz-bayesnet"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn38295"

RPM_NAME = "texlive-tikz-bayesnet-doc-2023.201.0.0.1svn38295-54.1.noarch.rpm"
RPM_HASH = "0b4693a792e0dff1d43eae7ab7604d86df05896f3915adb554e2bc7146d9100d00bbb07c320558f577ce1dce89be61dd866563ae150cd460d967a2f9d8de9768"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-bayesnet-doc"

RDEPENDS:${PN} += ""

inherit rpm
