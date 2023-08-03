SUMMARY = "Documentation for texlive-emarks"
DESCRIPTION = "This package includes the documentation for texlive-emarks"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn24504"

RPM_NAME = "texlive-emarks-doc-2023.209.1.0svn24504-54.1.noarch.rpm"
RPM_HASH = "27aa41868788562b89f133983b20be7bedadf8a2f6f9f8b74ccce1fe215c104278661559a82d83f1000e636f75d008ba5a6d33df2b9018321c865b531dbee1f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-emarks-doc"

RDEPENDS:${PN} += ""

inherit rpm
