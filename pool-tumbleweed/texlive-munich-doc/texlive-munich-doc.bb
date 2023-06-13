SUMMARY = "Documentation for texlive-munich"
DESCRIPTION = "This package includes the documentation for texlive-munich"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-munich-doc-2023.201.svn15878-54.1.noarch.rpm"
RPM_HASH = "8076e7814a4dd73d1fb517a92f6c8ecfdffac300e2dd3bcc9f53db39794540455bee68c11f131e55a0901154e0a2e55de451cfd63f442b98848c9a25bae7e062"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-munich-doc"

RDEPENDS:${PN} += ""

inherit rpm
