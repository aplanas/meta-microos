SUMMARY = "Documentation for texlive-datetime2-russian"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-russian"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn49345"

RPM_NAME = "texlive-datetime2-russian-doc-2023.201.1.1svn49345-52.1.noarch.rpm"
RPM_HASH = "8f55e079a4b992a5ca928d8b624e48fef29f6bf60bef83218e8eeedd760d0ff6c9b00f132918c5d67a4ca7c12a73b47d5f729cdadc8a8ab952e8fa1cc76a99f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-russian-doc"

RDEPENDS:${PN} += ""

inherit rpm
