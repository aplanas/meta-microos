SUMMARY = "Generates an issue files from different snippets"
DESCRIPTION = "issue-generator is a tool to create an issue file dynamically."
LICENSE = "GPL-2.0-or-later"

PV = "1.13"

RPM_NAME = "issue-generator-1.13-1.7.noarch.rpm"
RPM_HASH = "d43dad9635953286f05f7d7a57f2be8bdc70665a08621d9cd489aa9737a74aa8b8b82d36861c9764c016b4873dce41aa12ee5b5a74d1f7a178382f4fe0089802"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "issue-generator"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup"

inherit rpm
