SUMMARY = "Syntax highlight for terminal"
DESCRIPTION = "Cat-like tool with syntax highlighting for terminals."
LICENSE = "GPL-3.0-only"

PV = "0.0.1"

RPM_NAME = "scat-0.0.1-2.9.noarch.rpm"
RPM_HASH = "db5f25fd7f1e30772f809de9e8601ac4709198a858005775d185840f1ad40d2b8dbc5aff9f3104aa4c13aa62fb5485bbf6d8980b72fa6a676f99cf2934967b38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "scat"

RDEPENDS:${PN} += "/usr/bin/bash \
python3-Pygments"

inherit rpm
