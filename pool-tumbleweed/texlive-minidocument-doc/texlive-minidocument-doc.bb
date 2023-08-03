SUMMARY = "Documentation for texlive-minidocument"
DESCRIPTION = "This package includes the documentation for texlive-minidocument"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn43752"

RPM_NAME = "texlive-minidocument-doc-2023.209.1.0svn43752-55.1.noarch.rpm"
RPM_HASH = "96bd288d76269e82755a7dbd1d6e0e280fb47cc5a3471cdf22d514d941acc4df95d25049ac48f5e4d0a10df5ac45541a7eedd17568304acb991da34e136dfb03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-minidocument-doc"

RDEPENDS:${PN} += ""

inherit rpm
