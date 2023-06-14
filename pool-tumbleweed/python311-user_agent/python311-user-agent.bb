SUMMARY = "User-Agent generator for Python"
DESCRIPTION = "This module generates random, valid web user agents."
LICENSE = "MIT"

PV = "0.1.10"

RPM_NAME = "python311-user_agent-0.1.10-1.4.noarch.rpm"
RPM_HASH = "612c0a572860544c6c9771b1ae7f0f8b9eabbe63ff43499f015d54f7b6b1c1faf055ca1baeebb43e0e71deedb64ed8e22e4288beb3e6ba09e8a5643e51842ac4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-user-agent \
python311-user-agent \
python3dist-user-agent"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-six \
update-alternatives"

inherit rpm
