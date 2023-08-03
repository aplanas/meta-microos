SUMMARY = "Documentation for texlive-eolang"
DESCRIPTION = "This package includes the documentation for texlive-eolang"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.12.1svn66274"

RPM_NAME = "texlive-eolang-doc-2023.209.0.0.12.1svn66274-54.1.noarch.rpm"
RPM_HASH = "5b65b8a0457f3bb7b2cee7f0d58f7b78a00415566362a273706ac326e6c8c8f44d490fbf760e5a402802745480b2de458541113e9dc998c0e237f44bd155be48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eolang-doc"

RDEPENDS:${PN} += ""

inherit rpm
