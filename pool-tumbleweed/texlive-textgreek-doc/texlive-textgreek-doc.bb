SUMMARY = "Documentation for texlive-textgreek"
DESCRIPTION = "This package includes the documentation for texlive-textgreek"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.7svn44192"

RPM_NAME = "texlive-textgreek-doc-2023.201.0.0.7svn44192-54.1.noarch.rpm"
RPM_HASH = "96fdb88d885f2e03497124556e84459c93f4c1ba5aca6c011dd1f5eed80d756128e31362d861d04df0c5c8eec1ef2245241052f427021d459322b7efe9d49b9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-textgreek-doc"

RDEPENDS:${PN} += ""

inherit rpm
