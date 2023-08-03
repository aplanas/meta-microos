SUMMARY = "Documentation for texlive-aalok"
DESCRIPTION = "This package includes the documentation for texlive-aalok"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.6svn61719"

RPM_NAME = "texlive-aalok-doc-2023.209.0.0.6svn61719-55.1.noarch.rpm"
RPM_HASH = "954647e7beeabc0697782fb23c6ec0551250532685420c7107de14cf575654daf5bb4f01c2193354563938f2fa5f6695f298e18daeb04f5ec0459e93495c158f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-aalok-doc-mr \
texlive-aalok-doc"

RDEPENDS:${PN} += ""

inherit rpm
