SUMMARY = "Documentation files for the Qualcomm IPC Router protocol helper library"
DESCRIPTION = "This package provides the documentation for the Qualcomm IPC Router protocol helper library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.2"

RPM_NAME = "libqrtr-glib-devel-doc-1.2.2-1.5.noarch.rpm"
RPM_HASH = "dd509356316c75c0eec08d5d82a849976c1d6e6c6665119a1d459c63d5a257f6fc17d4178f194c1e89e4d29f4b7f4c87471bfce634ea5f3acba2fa9e16e4f06b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqrtr-glib-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
