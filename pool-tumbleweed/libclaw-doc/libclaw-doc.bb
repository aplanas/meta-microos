SUMMARY = "Documentation for Claw library"
DESCRIPTION = "This subpackage contains the documentation and examples for using \
libclaw."
LICENSE = "LGPL-2.1-or-later"

PV = "1.7.4"

RPM_NAME = "libclaw-doc-1.7.4-4.10.noarch.rpm"
RPM_HASH = "201779ba561c44596e3b4604944177037b632521691a772f90d46f7f26d9a1aceee64e29678880be158a09b95c245600a6e95f3cf6a878b441451efe6b97fe26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libclaw-doc"
RDEPENDS:${PN} += ""

inherit rpm
