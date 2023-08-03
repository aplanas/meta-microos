SUMMARY = "Documentation for texlive-xepersian-hm"
DESCRIPTION = "This package includes the documentation for texlive-xepersian-hm"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1asvn56272"

RPM_NAME = "texlive-xepersian-hm-doc-2023.209.1.1asvn56272-53.1.noarch.rpm"
RPM_HASH = "70241823a338b6e9905c9475298ae85ee9a39a1c60e0f7bb45c255dc7c1f4696bc10cd4a97a57311b36748efbe831249e3d539e66c8736d66f2e3f4aac0e4b5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xepersian-hm-doc-fa \
texlive-xepersian-hm-doc"

RDEPENDS:${PN} += ""

inherit rpm
