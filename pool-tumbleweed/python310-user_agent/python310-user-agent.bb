SUMMARY = "User-Agent generator for Python"
DESCRIPTION = "This module generates random, valid web user agents."
LICENSE = "MIT"

PV = "0.1.10"

RPM_NAME = "python310-user_agent-0.1.10-1.4.noarch.rpm"
RPM_HASH = "b27c276fe5a4d3a17fced80a16d592c43917f028a883601ba746662cad7217eb02a267093db9a38dbc7039d3db206a5c0ad5a380c090d55a51660237fd900b91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-user-agent \
python3.10dist-user-agent \
python310-user-agent \
python3dist-user-agent"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-six \
update-alternatives"

inherit rpm
