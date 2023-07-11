SUMMARY = "Documentation for texlive-interfaces"
DESCRIPTION = "This package includes the documentation for texlive-interfaces"
LICENSE = "LPPL-1.0"

PV = "2023.208.3.1svn21474"

RPM_NAME = "texlive-interfaces-doc-2023.208.3.1svn21474-53.1.noarch.rpm"
RPM_HASH = "d909d152e94f3d6cd1ed54a844a5f8ace2a9db731a1a17fdb026f2eb02c914d278ec7712639767683c79fbec972dd070098b5ee26a3151b4247e1e42e6f141e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-interfaces-doc"

RDEPENDS:${PN} += ""

inherit rpm
