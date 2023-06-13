SUMMARY = "Documentation for texlive-outlines"
DESCRIPTION = "This package includes the documentation for texlive-outlines"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn25192"

RPM_NAME = "texlive-outlines-doc-2023.201.1.1svn25192-54.1.noarch.rpm"
RPM_HASH = "ecc85d198a8b603c89cae7c2849e32a3b64ed17a0d5b41a25fbe995499f8ae14b31ffe5cef59e40a8dba00d2e7204d68a4455d5c73b45ad13f3d80c3ea66f634"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-outlines-doc"

RDEPENDS:${PN} += ""

inherit rpm
