SUMMARY = "Weblate Documentation"
DESCRIPTION = "HTML documentation files for the Weblate collaborative web translation tool."
LICENSE = "GPL-3.0-or-later"

PV = "4.14.2"

RPM_NAME = "weblate-doc-4.14.2-3.2.noarch.rpm"
RPM_HASH = "c18f154c85e0aea89eb0e0fd4c624ea465fbe34fbc68b9180a0790b795e8209f48bcf9337ff05101813ec3068528c30ca578c68199ce189ff43a39c89dae1cd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "weblate-doc"

RDEPENDS:${PN} += ""

inherit rpm
