SUMMARY = "Documentation for texlive-iopart-num"
DESCRIPTION = "This package includes the documentation for texlive-iopart-num"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn15878"

RPM_NAME = "texlive-iopart-num-doc-2023.201.2.1svn15878-55.1.noarch.rpm"
RPM_HASH = "5b07ffe9815cb18041f740da779176a8c728dc4aba0c08a1edcaaf05e8942ec082547d0b4b9560a2905b48e5f418776606afb7c1b0abddca36cbd254ad10f5e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-iopart-num-doc"

RDEPENDS:${PN} += ""

inherit rpm
