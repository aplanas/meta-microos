SUMMARY = "A Python package management system"
DESCRIPTION = "Pip is a replacement for easy_install. It uses mostly the same techniques for \
finding packages, so packages that were made easy_installable should be \
pip-installable as well."
LICENSE = "MIT"

PV = "23.1.2"

RPM_NAME = "python310-pip-23.1.2-2.3.noarch.rpm"
RPM_HASH = "0a58c3b969810df2998baad3965d09b35f9493f29188a86eb6a52722b914a6ee3fa17744b9ba482868cdb9aeff5931a5f9afdd340eec360aeebb90d0ef94d665"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pip \
python310-pip \
python3dist-pip"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
alts \
ca-certificates \
coreutils \
python-abi \
python310-setuptools \
python310-xml"

inherit rpm
