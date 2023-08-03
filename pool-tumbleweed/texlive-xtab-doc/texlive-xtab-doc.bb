SUMMARY = "Documentation for texlive-xtab"
DESCRIPTION = "This package includes the documentation for texlive-xtab"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.3fsvn23347"

RPM_NAME = "texlive-xtab-doc-2023.209.2.3fsvn23347-53.1.noarch.rpm"
RPM_HASH = "ffc21a7f5957d64a34088611aa57db9e09b68b140723ff01add2d9c2f7e65582de277346df4427c720a4113b5f048904314aed70c8ba18f96e119cddf0bac1d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xtab-doc"

RDEPENDS:${PN} += ""

inherit rpm
