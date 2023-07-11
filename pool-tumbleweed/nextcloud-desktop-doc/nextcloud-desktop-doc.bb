SUMMARY = "Documentation for nextcloud-desktop"
DESCRIPTION = "The Nextcloud Desktop Client is a tool to synchronise files from \
the Nextcloud Server with your computer. \
 \
This package contains the documentation."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "3.9.0"

RPM_NAME = "nextcloud-desktop-doc-3.9.0-3.1.noarch.rpm"
RPM_HASH = "eb17829277da170bb892ea7d690c8e0bd7f30a8903585de725abcbfd7e03a5ae40358f55bc0b2da261df23f790c0f28c2a3938a63c8d0c3870c60fede6eb94be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nextcloud-client-doc \
nextcloud-desktop-doc"

RDEPENDS:${PN} += ""

inherit rpm
