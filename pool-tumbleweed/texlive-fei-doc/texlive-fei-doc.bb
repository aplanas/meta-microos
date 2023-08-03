SUMMARY = "Documentation for texlive-fei"
DESCRIPTION = "This package includes the documentation for texlive-fei"
LICENSE = "LPPL-1.0"

PV = "2023.209.4.10.4svn65352"

RPM_NAME = "texlive-fei-doc-2023.209.4.10.4svn65352-53.1.noarch.rpm"
RPM_HASH = "47d58104928e2202affa9d43b6923329814ff95c299be4ddae3461b6269b2141657b6d911371b4aad475d6d187746392e21ef90489a59486fb3670d592cf0271"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-fei-doc-pt-BR \
texlive-fei-doc"

RDEPENDS:${PN} += ""

inherit rpm
