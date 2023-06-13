SUMMARY = "Documentation for texlive-schule"
DESCRIPTION = "This package includes the documentation for texlive-schule"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.8.3svn60210"

RPM_NAME = "texlive-schule-doc-2023.201.0.0.8.3svn60210-53.1.noarch.rpm"
RPM_HASH = "6ce09b982c93c6c896e6e149307a9046f6285b406f1338c2aae4edcf36d7f4afbf91f1ec2a57ef2e83f3861c8609e60db6ff9a1f47687470a83a58f37b73f608"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-schule-doc:de) \
texlive-schule-doc"

RDEPENDS:${PN} += ""

inherit rpm
