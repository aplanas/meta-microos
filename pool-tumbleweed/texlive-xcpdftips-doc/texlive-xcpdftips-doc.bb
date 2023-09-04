SUMMARY = "Documentation for texlive-xcpdftips"
DESCRIPTION = "This package includes the documentation for texlive-xcpdftips"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.1svn50449"

RPM_NAME = "texlive-xcpdftips-doc-2023.209.1.1svn50449-53.2.noarch.rpm"
RPM_HASH = "be7a52eba312ed3eb3539ba9ca21a8c3f1e8acf7549af72cc563eac1c1e66ab77212cd163c79c48e22570547bb8312455a1a689d32585daf539261ac0eda003a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xcpdftips-doc"

RDEPENDS:${PN} += ""

inherit rpm
