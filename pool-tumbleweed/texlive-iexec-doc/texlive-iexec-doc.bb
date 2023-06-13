SUMMARY = "Documentation for texlive-iexec"
DESCRIPTION = "This package includes the documentation for texlive-iexec"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.11.4svn64908"

RPM_NAME = "texlive-iexec-doc-2023.201.0.0.11.4svn64908-52.1.noarch.rpm"
RPM_HASH = "a568d006367cde98a5046b0156d1df09f7f74157fcbbd1e295e357d525871de9918be6bac9a716236fb43dfc1dbfb5c7175b071c5d9ac6d97e108d05d987229f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-iexec-doc"

RDEPENDS:${PN} += ""

inherit rpm
