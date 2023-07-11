SUMMARY = "Documentation for liborigin"
DESCRIPTION = "This package provides the documentation for liborigin."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.1"

RPM_NAME = "liborigin-doc-3.0.1-1.11.noarch.rpm"
RPM_HASH = "691a3f4052de26726929d1353f503f1465b84020b899d990f1f3490717975d4dedc35dfd8720529b0c5564724634a867dccca330883ba5e137380667d94dc9d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "liborigin-doc"

RDEPENDS:${PN} += ""

inherit rpm
