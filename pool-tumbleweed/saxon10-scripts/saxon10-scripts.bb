SUMMARY = "Utility scripts for saxon10"
DESCRIPTION = "Utility scripts for saxon10."
LICENSE = "Apache-2.0 & MPL-2.0"

PV = "10.9"

RPM_NAME = "saxon10-scripts-10.9-1.1.noarch.rpm"
RPM_HASH = "20dc66c5272aa2e0c0447c0a2c3adda1e2c38217256eeab40c2f1c839a68976fa990ea94545c715d8b7df7954f1b2725291c45723791ccd90632b577cee2d85e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "saxon10-scripts"

RDEPENDS:${PN} += "/usr/bin/sh \
javapackages-tools \
jaxp-parser-impl \
jline \
saxon10 \
xml-commons-apis"

inherit rpm
