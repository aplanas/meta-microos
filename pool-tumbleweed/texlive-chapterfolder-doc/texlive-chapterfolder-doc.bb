SUMMARY = "Documentation for texlive-chapterfolder"
DESCRIPTION = "This package includes the documentation for texlive-chapterfolder"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0.1svn15878"

RPM_NAME = "texlive-chapterfolder-doc-2023.201.2.0.1svn15878-53.1.noarch.rpm"
RPM_HASH = "84be62679a0ceabbf5ccdc8e1969c33bfe91e8b464f14d8ee7b5b2855c6c72f2ad0dfec9f0bd504572fe90c364c7387caddfc1416b07d7fabe8dfde70d997fe2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chapterfolder-doc"

RDEPENDS:${PN} += ""

inherit rpm
