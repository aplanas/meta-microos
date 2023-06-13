SUMMARY = "Simplified Java Printing Support for SWT"
DESCRIPTION = "A simple, light weight, extensible Java printing plug-in for SWT."
LICENSE = "EPL-1.0"

PV = "1.0.4"

RPM_NAME = "paperclips-1.0.4-3.6.noarch.rpm"
RPM_HASH = "0f42fb32faaaa80cbe2e234fe6b9d09f1e719332d9b64054dbc84c2858eec7fd03504cdc08255c49564bccd4b06db19d2fec3124f1335804eaad1f7ea25ee1a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "paperclips"

RDEPENDS:${PN} += ""

inherit rpm
