SUMMARY = "A Python package management system"
DESCRIPTION = "Pip is a replacement for easy_install. It uses mostly the same techniques for \
finding packages, so packages that were made easy_installable should be \
pip-installable as well."
LICENSE = "MIT"

PV = "23.1.2"

RPM_NAME = "python311-pip-wheel-23.1.2-2.3.noarch.rpm"
RPM_HASH = "b8246a10c3cde7db0e3946e51fa837ae62c64dbb95ab2ff1bddaf67dbcd1cece5397e8513bd1b0597504e62534b716035762106fed561d5b42dfd4966e252328"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pip-wheel \
python311-pip-wheel"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
ca-certificates \
coreutils \
python311-setuptools \
python311-xml"

inherit rpm
