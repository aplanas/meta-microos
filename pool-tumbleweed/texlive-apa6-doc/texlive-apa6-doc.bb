SUMMARY = "Documentation for texlive-apa6"
DESCRIPTION = "This package includes the documentation for texlive-apa6"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.34svn53406"

RPM_NAME = "texlive-apa6-doc-2023.201.2.34svn53406-54.1.noarch.rpm"
RPM_HASH = "73d45eb126ed4ff85a8a699cb321ae30b9b8356bbe041c5b3f714d8eca27d140c17f2ee2ec4fc188aa2aa6ca450eac4713245a3d7350aab1fdb192bf15d39430"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-apa6-doc"

RDEPENDS:${PN} += ""

inherit rpm
