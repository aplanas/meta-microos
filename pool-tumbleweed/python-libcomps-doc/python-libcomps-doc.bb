SUMMARY = "Documentation files for python bindings libcomps library"
DESCRIPTION = "Documentation files for python bindings libcomps library."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.19"

RPM_NAME = "python-libcomps-doc-0.1.19-2.4.noarch.rpm"
RPM_HASH = "082591aa4762b2d847611484efd3ad2bf3dc922ef735cbf6f78e279a9818ae63e164651120116c6cf9cff484cdb2e813385d0857d5d7ff8ca1f3959fa465794a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-libcomps-doc"

RDEPENDS:${PN} += ""

inherit rpm
