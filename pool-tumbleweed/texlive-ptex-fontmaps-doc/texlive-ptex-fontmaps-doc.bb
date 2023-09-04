SUMMARY = "Documentation for texlive-ptex-fontmaps"
DESCRIPTION = "This package includes the documentation for texlive-ptex-fontmaps"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.20210625.0svn65953"

RPM_NAME = "texlive-ptex-fontmaps-doc-2023.209.20210625.0svn65953-54.2.noarch.rpm"
RPM_HASH = "d610bfb915e4d420104289f8df3e1acaf1cca1012e5091fc96f1d065a686725008e1851684adb764b5f847d0c745e55dcd418183f1f64d83fd6eda3d7b7866c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ptex-fontmaps-doc"

RDEPENDS:${PN} += ""

inherit rpm
