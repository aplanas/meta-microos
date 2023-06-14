SUMMARY = "Documentation for the xapian-core libraries"
DESCRIPTION = "Xapian is a Probabilistic Information Retrieval library. \
 \
This subpackage provides the documentation for Xapian."
LICENSE = "GPL-2.0-only"

PV = "1.4.21"

RPM_NAME = "xapian-core-doc-1.4.21-1.3.aarch64.rpm"
RPM_HASH = "baf243c8145aecf24e1247b0041ba3fa47fabc6892e14db8fba40f892d6dd3e72d505c4c6864f7d9e668700e8b05e4a9343e2fc39d0f48843cbaf2a3379f2f4d"

RPROVIDES:${PN} += "xapian-core-doc"

RDEPENDS:${PN} += "xapian-core"

inherit rpm
