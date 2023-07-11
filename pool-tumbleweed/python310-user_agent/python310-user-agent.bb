SUMMARY = "User-Agent generator for Python"
DESCRIPTION = "This module generates random, valid web user agents."
LICENSE = "MIT"

PV = "0.1.10"

RPM_NAME = "python310-user_agent-0.1.10-2.3.noarch.rpm"
RPM_HASH = "04a8755a19fe65cafbde974ea73e8c79ab25dc89ac04df967a22f8df119eb827e30fd15fb74affa89a61b99487b944c7892d7bd55e49885c73037ce972d1794b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-user-agent \
python310-user-agent \
python3dist-user-agent"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
