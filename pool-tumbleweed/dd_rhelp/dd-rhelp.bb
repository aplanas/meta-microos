SUMMARY = "Bash Helper Script That Handles dd_rescue"
DESCRIPTION = "dd_rhelp is a bash helper script that handles dd_rescue. dd_rescue roughly acts \
as the dd linux command with the caracteristic to NOT stop when it falls on \
read/write. \
 \
dd_rhelp intelligently controls dd_rescue to first copy all blocks from areas \
that work and only then tries to approach the bad spots from both sides."
LICENSE = "GPL-2.0-or-later"

PV = "0.3.0"

RPM_NAME = "dd_rhelp-0.3.0-14.2.noarch.rpm"
RPM_HASH = "0898fd217bd9179ae54dd533330803bdd1d8472c8dbd875dd8ca4e801d4e090eec6a268a257b2decb9324ec1cebb559be92f12dc035c835977c785a5022e9d6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dd-rhelp"

RDEPENDS:${PN} += "/usr/bin/bash \
dd-rescue"

inherit rpm
