SUMMARY = "Documentation for texlive-tabularray"
DESCRIPTION = "This package includes the documentation for texlive-tabularray"
LICENSE = "LPPL-1.0"

PV = "2023.201.2023asvn66276"

RPM_NAME = "texlive-tabularray-doc-2023.201.2023asvn66276-54.1.noarch.rpm"
RPM_HASH = "5deb68abffcd2de84f5905c12ab930cd934c158448785a15d316e30743878b5ce369c79537da822d61d25f4121ff15b20d9390bd8e569cf103ced05f827764d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tabularray-doc"

RDEPENDS:${PN} += ""

inherit rpm
