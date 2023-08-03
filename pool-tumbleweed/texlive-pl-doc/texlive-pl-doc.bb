SUMMARY = "Documentation for texlive-pl"
DESCRIPTION = "This package includes the documentation for texlive-pl"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.09asvn58661"

RPM_NAME = "texlive-pl-doc-2023.209.1.09asvn58661-52.1.noarch.rpm"
RPM_HASH = "9dacf643d54bd2c37ba254e820c21bc8e2e922bcc4055acbd53ae2ff2c65d274de77e8d15b28c54f43e87ce382849013273476f26abc4720540a47401a4ed1e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pl-doc"

RDEPENDS:${PN} += ""

inherit rpm
