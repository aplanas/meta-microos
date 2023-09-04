SUMMARY = "Documentation for texlive-endiagram"
DESCRIPTION = "This package includes the documentation for texlive-endiagram"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1dsvn34486"

RPM_NAME = "texlive-endiagram-doc-2023.209.0.0.1dsvn34486-54.2.noarch.rpm"
RPM_HASH = "bb590cfe4a4f08a2fcbdae8a2166a501cab9e901c43a55b123b594b89c19e4f9e6940e1699dccb09e153d700a2fb9c462b5df4c913e0d36e43ae5a8a8e8cad0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-endiagram-doc"

RDEPENDS:${PN} += ""

inherit rpm
