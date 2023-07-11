SUMMARY = "Documentation of Botan"
DESCRIPTION = "Documentation of Botan package."
LICENSE = "BSD-2-Clause"

PV = "2.19.3"

RPM_NAME = "Botan-doc-2.19.3-1.6.noarch.rpm"
RPM_HASH = "19c7e5ae6b51c8e4c49b2de9a83c18bd72b2edc7963d08ad0c657c8ed46cbc9335c78ce083e4077a59a4a0af42ee185dbdeeea88a812856e5f177b215232b0a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "Botan-doc"

RDEPENDS:${PN} += ""

inherit rpm
