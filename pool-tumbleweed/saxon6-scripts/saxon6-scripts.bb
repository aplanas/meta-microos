SUMMARY = "Utility scripts for saxon6"
DESCRIPTION = "Utility scripts for saxon6."
LICENSE = "MPL-1.0"

PV = "6.5.5"

RPM_NAME = "saxon6-scripts-6.5.5-16.6.noarch.rpm"
RPM_HASH = "2f2a226d4f15929ba48d99727885a848211e41299fd12392563792feb8fb9b11c7843dd48f77c830b7a4367ceeb5fea70c843f3ca0d61c655280124b4203cfba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "saxon-scripts \
saxon6-scripts"
RDEPENDS:${PN} += "saxon6"

inherit rpm
