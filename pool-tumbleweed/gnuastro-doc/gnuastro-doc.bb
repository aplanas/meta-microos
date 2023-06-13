SUMMARY = "Documentation for the GNU Astromomy Utilities"
DESCRIPTION = "Additional documentation for the GNU Astromomy Utilities."
LICENSE = "GPL-3.0-or-later"

PV = "0.19"

RPM_NAME = "gnuastro-doc-0.19-1.10.noarch.rpm"
RPM_HASH = "f87762f209182709cb5aaa302c7bf95f96c553676c322288a7693e4ab7a9a294297019a6f0c78c2652fdd8a9cd766b5d8ba1f27fa66917bf07a06bc6c2f5efa3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnuastro-doc"

RDEPENDS:${PN} += ""

inherit rpm
