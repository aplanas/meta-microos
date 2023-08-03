SUMMARY = "Documentation for texlive-europasscv"
DESCRIPTION = "This package includes the documentation for texlive-europasscv"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn56829"

RPM_NAME = "texlive-europasscv-doc-2023.209.svn56829-53.1.noarch.rpm"
RPM_HASH = "94b48872b8b6a1052a430edf28c5cdc4d8254467385b5167d57b98a6c12730568984fe19d38e719776a87c99adba92966f6a7e2b641373a0d4651648bcba1b8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-europasscv-doc"

RDEPENDS:${PN} += ""

inherit rpm
