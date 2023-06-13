SUMMARY = "Documentation for CKermit"
DESCRIPTION = "This package contains the documentation and manual pages for ckermit"
LICENSE = "BSD-3-Clause"

PV = "9.0.302"

RPM_NAME = "ckermit-doc-9.0.302-14.17.noarch.rpm"
RPM_HASH = "0ffcf590b08f430cb48d673d773d53646ddcbe884fc0a77b6d4780532b3f5855671a9b2559f8aaf0b45f169e05816b201add475e7eb305519104102ed69b0ee8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ckermit-doc"

RDEPENDS:${PN} += ""

inherit rpm
