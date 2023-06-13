SUMMARY = "Displays the result of a notmuch count query"
DESCRIPTION = "Displays the result of a notmuch count query."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-notmuch-2.1.5-3.3.noarch.rpm"
RPM_HASH = "238f4720a31adc056721e6d03a5acab25d4577e0b5e015139ac278cbcb3780a37a174bbe6ba03ca4aa2cb893ff5b27e90eb96ebea03171d2829f14123a69bc82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-notmuch"

RDEPENDS:${PN} += "bumblebee-status \
notmuch"

inherit rpm
