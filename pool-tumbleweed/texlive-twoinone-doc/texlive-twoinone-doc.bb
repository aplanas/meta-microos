SUMMARY = "Documentation for texlive-twoinone"
DESCRIPTION = "This package includes the documentation for texlive-twoinone"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn17024"

RPM_NAME = "texlive-twoinone-doc-2023.209.svn17024-53.1.noarch.rpm"
RPM_HASH = "fbce614cfacb18f89ccd00c8e941e09e9d63fe7e33aad33a872881f47ae315303bc546a1cc634cb6970a841eaea3a32dc00e3a52cb0a57cb938fd659c9ad4a13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-twoinone-doc"

RDEPENDS:${PN} += ""

inherit rpm
