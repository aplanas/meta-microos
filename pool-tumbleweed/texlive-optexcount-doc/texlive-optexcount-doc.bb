SUMMARY = "Documentation for texlive-optexcount"
DESCRIPTION = "This package includes the documentation for texlive-optexcount"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn59817"

RPM_NAME = "texlive-optexcount-doc-2023.209.1.1svn59817-55.1.noarch.rpm"
RPM_HASH = "bb87ed4852c53dce24063fe7f1378df5441ff30f90c391c8939745e27fa70f6cd108218adf8d2ada0c5816a669ce74c10fa1df1dd5663313f7b9853f6c74ca83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-optexcount-doc"

RDEPENDS:${PN} += ""

inherit rpm
