SUMMARY = "Utility scripts for saxon9"
DESCRIPTION = "Utility scripts for saxon9."
LICENSE = "Apache-2.0 & MPL-1.0"

PV = "9.4.0.7"

RPM_NAME = "saxon9-scripts-9.4.0.7-16.7.noarch.rpm"
RPM_HASH = "a5ee9f8ad5fff06062acf56d4277f4a47ccbec5cf1f68bacf4abeae0b8cc27e2c3109c26f2fffb7e30760ba2e8c57c92bfa77d5812d3635aabf2568e1ab680e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "saxon9-scripts"

RDEPENDS:${PN} += "/usr/bin/sh \
jaxp-parser-impl \
saxon9 \
xml-commons-apis"

inherit rpm
