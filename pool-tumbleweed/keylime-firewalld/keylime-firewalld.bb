SUMMARY = "Firewalld service file for keylime"
DESCRIPTION = "Subpackage of keylime for the firewalld XML service file."
LICENSE = "Apache-2.0 & MIT"

PV = "7.3.0"

RPM_NAME = "keylime-firewalld-7.3.0-1.1.noarch.rpm"
RPM_HASH = "c6d9743c9abbdb1823630a2e752a75bd31de64c8e3a6763b0d187528ae96cc667de0ed004de878c2b6a9399259ea891630221c4ace4c3b1eb6c4daf3c85502e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "keylime-firewalld"

RDEPENDS:${PN} += "/usr/bin/sh \
python3-keylime"

inherit rpm
