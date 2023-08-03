SUMMARY = "Documentation for texlive-simplivre"
DESCRIPTION = "This package includes the documentation for texlive-simplivre"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn65475"

RPM_NAME = "texlive-simplivre-doc-2023.209.svn65475-58.1.noarch.rpm"
RPM_HASH = "cc373bdc7f5dd6ff7b38eb16a78fb9ed614229a2ad1d199eadced9614869fe4a58c2bfd1ef1c03ac3f6df3e95be7e761ff47d4e1511aea60e66070bfcdd09806"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-simplivre-doc"

RDEPENDS:${PN} += ""

inherit rpm
