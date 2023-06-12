SUMMARY = "Documentation for texlive-forum"
DESCRIPTION = "This package includes the documentation for texlive-forum"
LICENSE = "OFL-1.1"

PV = "2023.201.svn64566"

RPM_NAME = "texlive-forum-doc-2023.201.svn64566-52.1.noarch.rpm"
RPM_HASH = "8d7801a70a6ed8b21467ff0baed3b21391c740de4101fbea172e8b4675cfe3f36825ba1cb22d48825cf4b52a868a64bd953a7f493e90a9093f73555974971d35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-forum-doc"
RDEPENDS:${PN} += ""

inherit rpm
