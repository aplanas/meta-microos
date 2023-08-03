SUMMARY = "Documentation for texlive-datetime2-italian"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-italian"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn37146"

RPM_NAME = "texlive-datetime2-italian-doc-2023.209.1.3svn37146-53.1.noarch.rpm"
RPM_HASH = "b5d4b79ecfdf8fe892bfa8a71661b4f203c68e20c80d2dd44875bd1fabfa98be06b64f064e9447a655dcdc916eff6211de9d97d9bebc7054c5c2177a0769bc30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-italian-doc"

RDEPENDS:${PN} += ""

inherit rpm
