SUMMARY = "Python library for the BrowserID Protocol"
DESCRIPTION = "This is a python client library for the BrowserID protocol that underlies \
Mozilla Persona."
LICENSE = "MPL-2.0"

PV = "0.14.0"

RPM_NAME = "python311-PyBrowserID-0.14.0-4.10.noarch.rpm"
RPM_HASH = "d94fe018bf37330ffa9bd9cbebda8541a1e6a0b6c5927f03e207aa7b8ceba673a503fe6ba81877420b5bb463c594316b3be64fdad1e3c84f3d417191f6c7792e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyBrowserID \
python3.11dist-pybrowserid \
python311-PyBrowserID \
python3dist-pybrowserid"

RDEPENDS:${PN} += "python-abi \
python311-requests"

inherit rpm
