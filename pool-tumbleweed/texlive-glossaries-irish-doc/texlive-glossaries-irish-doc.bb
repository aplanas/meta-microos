SUMMARY = "Documentation for texlive-glossaries-irish"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-irish"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn35665"

RPM_NAME = "texlive-glossaries-irish-doc-2023.209.1.0svn35665-54.2.noarch.rpm"
RPM_HASH = "92fc84bf6f524f0639fa830b8e3fb7b684af5791646691ad8cb362aa9609da797033665f5152d4543aeadbf641473cf0cf5085e8b955fa8c0db0297682545e35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-irish-doc"

RDEPENDS:${PN} += ""

inherit rpm
