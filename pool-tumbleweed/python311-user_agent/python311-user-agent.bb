SUMMARY = "User-Agent generator for Python"
DESCRIPTION = "This module generates random, valid web user agents."
LICENSE = "MIT"

PV = "0.1.10"

RPM_NAME = "python311-user_agent-0.1.10-2.3.noarch.rpm"
RPM_HASH = "64cd700f5b975e9cc21e2ad67c2b4a31bfed46d5969c42db9d2333e994877400d4b27a0d7aa92cecf8d604a83d7ce8d3991a70df8445ce1f6447d068faf37f38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-user-agent \
python3.11dist-user-agent \
python311-user-agent \
python3dist-user-agent"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
