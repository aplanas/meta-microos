SUMMARY = "Documentation for ddccontrol"
DESCRIPTION = "This is the HTML documentation for ddccontrol."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.2+20140105+git9d89d8c"

RPM_NAME = "ddccontrol-doc-0.4.2+20140105+git9d89d8c-4.14.noarch.rpm"
RPM_HASH = "fd5c176004ed6c90b0ffb718c89e8736b1c766e8b523f28a75170480c1b6bb868ae29ea5fe235d7e63c0306adea80c7f0303c28cc7a7596bcdc0daf9505c695c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ddccontrol-doc"

RDEPENDS:${PN} += ""

inherit rpm
