SUMMARY = "Documentation for texlive-ejpecp"
DESCRIPTION = "This package includes the documentation for texlive-ejpecp"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.11.3svn60950"

RPM_NAME = "texlive-ejpecp-doc-2023.209.1.11.3svn60950-54.1.noarch.rpm"
RPM_HASH = "31f8b38fc94e3cebd52b76a95759cee9a0f4cd291521caf554e518287c6e84e1485d67d4411b0116d7584e586306f738334a88ea32ec0cada1298b57883b3794"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ejpecp-doc"

RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
