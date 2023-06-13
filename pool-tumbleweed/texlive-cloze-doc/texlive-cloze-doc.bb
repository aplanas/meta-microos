SUMMARY = "Documentation for texlive-cloze"
DESCRIPTION = "This package includes the documentation for texlive-cloze"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6svn55763"

RPM_NAME = "texlive-cloze-doc-2023.201.1.6svn55763-53.1.noarch.rpm"
RPM_HASH = "97597f9389b009bc5a56a0adbedac076ff7c9d6daa6a9a206dd3774424d977905cce5529b0edbb0515f66999e22c477096996a84d196ce6782b10077a814ec87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cloze-doc"

RDEPENDS:${PN} += ""

inherit rpm
