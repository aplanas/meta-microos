SUMMARY = "A Python package management system"
DESCRIPTION = "Pip is a replacement for easy_install. It uses mostly the same techniques for \
finding packages, so packages that were made easy_installable should be \
pip-installable as well."
LICENSE = "MIT"

PV = "23.1.2"

RPM_NAME = "python39-pip-wheel-23.1.2-1.1.noarch.rpm"
RPM_HASH = "fbd3cca9a330946d1e2d7e85880170dc5e555ccf82d892f20cdef7ea810f5a264160bdf0c4ce093f464fb9427968efd721d0ab03905c19659f1e100bd83e37cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pip-wheel"

RDEPENDS:${PN} += "/bin/sh \
alts \
ca-certificates \
coreutils \
python39-setuptools \
python39-xml"

inherit rpm
