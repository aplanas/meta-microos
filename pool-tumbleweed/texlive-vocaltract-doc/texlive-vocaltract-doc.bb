SUMMARY = "Documentation for texlive-vocaltract"
DESCRIPTION = "This package includes the documentation for texlive-vocaltract"
LICENSE = "LPPL-1.0"

PV = "2023.201.1svn25629"

RPM_NAME = "texlive-vocaltract-doc-2023.201.1svn25629-53.1.noarch.rpm"
RPM_HASH = "b389d8710e65eda4e153d0c83728ade4ea361c604bbfe866e3b439d5493136e186f40787f2f633575a6dff529084c56e533adb0f6a49468e29da93ce6347d1c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-vocaltract-doc"

RDEPENDS:${PN} += ""

inherit rpm
