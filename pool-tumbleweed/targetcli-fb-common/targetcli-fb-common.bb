SUMMARY = "Common targetcli-fb subpackage for either flavor of Python"
DESCRIPTION = "targetcli-fb-common is the invariant base package needed by \
all python-version-dependant packages, such as python3-*-targetcli-fb."
LICENSE = "Apache-2.0"

PV = "2.1.54"

RPM_NAME = "targetcli-fb-common-2.1.54-2.1.noarch.rpm"
RPM_HASH = "159a137bea1380b65f48da84eb18afefaa2ae633c9df0fdbdb50fe0b476ac0b20d1e252227b7528bd8e7ac3e15814fb2aad229a9a1e385c958b9385e4b5d516a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-targetcli-fb-common \
python311-targetcli-fb-common \
python39-targetcli-fb-common \
targetcli-fb-common"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
