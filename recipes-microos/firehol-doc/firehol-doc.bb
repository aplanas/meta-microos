SUMMARY = "FireHOL documentation"
DESCRIPTION = "Contains documentation and configuration examples for FireHOL."
LICENSE = "GPL-2.0-only"

PV = "3.1.7"

RPM_NAME = "firehol-doc-3.1.7-2.6.noarch.rpm"
RPM_HASH = "39a18cc07c97bbf931a153c8734d61a0343a121c9a58441f094d9581894f18c70a6085cd212d4bdef40de314cfc0b973ddfe82fd85eb618158d740b33a1c7c0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firehol-doc"
RDEPENDS:${PN} += ""

inherit rpm
