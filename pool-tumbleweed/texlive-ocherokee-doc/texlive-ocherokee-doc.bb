SUMMARY = "Documentation for texlive-ocherokee"
DESCRIPTION = "This package includes the documentation for texlive-ocherokee"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn25689"

RPM_NAME = "texlive-ocherokee-doc-2023.209.svn25689-55.1.noarch.rpm"
RPM_HASH = "ac34093b63d7d41ee96cea4b0e8853fc3807498fe486fe618c4eb72a1601ae6755448be0141ec818bb6a6f9ef93f8add9fe5f991f8b89c0ef12bc6c90d4fa31b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ocherokee-doc"

RDEPENDS:${PN} += ""

inherit rpm
