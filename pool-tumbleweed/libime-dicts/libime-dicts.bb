SUMMARY = "Dictionary files for libime"
DESCRIPTION = "This package provides dictionary files for libime."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.17"

RPM_NAME = "libime-dicts-1.0.17-1.3.aarch64.rpm"
RPM_HASH = "282455b1d29520e8b3601fbab440224f2a9293e5797c3ec69583b4520a83ac085d0872d4c263cdd553cb5ff82b37621900bbbf0c015cfbfa6a2b0f6d91ea86e5"

RPROVIDES:${PN} += "libime-dicts"

RDEPENDS:${PN} += ""

inherit rpm
