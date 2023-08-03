SUMMARY = "Documentation for texlive-babel-croatian"
DESCRIPTION = "This package includes the documentation for texlive-babel-croatian"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3lsvn35198"

RPM_NAME = "texlive-babel-croatian-doc-2023.209.1.3lsvn35198-54.1.noarch.rpm"
RPM_HASH = "0dbab05d7218a74dc2545386d182076bf33d738f01ef23388a1b04e325cff1998b93947bfe9b87b6e6b21f6063c7208ab38eb43c82ee757df3de00f49c9fd679"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-croatian-doc"

RDEPENDS:${PN} += ""

inherit rpm
