SUMMARY = "User-Agent generator for Python"
DESCRIPTION = "This module generates random, valid web user agents."
LICENSE = "MIT"

PV = "0.1.10"

RPM_NAME = "python39-user_agent-0.1.10-2.3.noarch.rpm"
RPM_HASH = "7fd54c5b7f6f767ccf5fb475e10de0ceea0812020587b7c98d6cc75ab16709c60adac342c861cea2560adf3b69a96fa9dd33cde15f9a4f466571496079dc2d1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-user-agent \
python39-user-agent \
python3dist-user-agent"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
