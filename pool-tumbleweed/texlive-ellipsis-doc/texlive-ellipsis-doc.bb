SUMMARY = "Documentation for texlive-ellipsis"
DESCRIPTION = "This package includes the documentation for texlive-ellipsis"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.8svn55418"

RPM_NAME = "texlive-ellipsis-doc-2023.209.1.8svn55418-54.1.noarch.rpm"
RPM_HASH = "9ded48799521735593ff78fb4bf24054b15fb849bfb8b10089b6ed2fb6059b361cc5c8028d8628c2a4540d146b55cb25e03b17c8b00e58ca91ac2d316f4e3efb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ellipsis-doc"

RDEPENDS:${PN} += ""

inherit rpm
