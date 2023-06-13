SUMMARY = "Documentation for texlive-assoccnt"
DESCRIPTION = "This package includes the documentation for texlive-assoccnt"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.8svn38497"

RPM_NAME = "texlive-assoccnt-doc-2023.201.0.0.8svn38497-53.1.noarch.rpm"
RPM_HASH = "ee6a8ec4fd6226fa6f64e23d04f06f3ac29a110c89b368ddb017290999be17ac6a239c279fa47103ea51acf3ec42bf77a460e9650e8c3130ca6a68775b5d0bcc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-assoccnt-doc"

RDEPENDS:${PN} += ""

inherit rpm
