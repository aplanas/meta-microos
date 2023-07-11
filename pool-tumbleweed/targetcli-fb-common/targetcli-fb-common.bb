SUMMARY = "Common targetcli-fb subpackage for either flavor of Python"
DESCRIPTION = "targetcli-fb-common is the invariant base package needed by \
all python-version-dependant packages, such as python3-*-targetcli-fb."
LICENSE = "Apache-2.0"

PV = "2.1.56"

RPM_NAME = "targetcli-fb-common-2.1.56-1.3.noarch.rpm"
RPM_HASH = "121e1c1ef60cb24212af9e8beb188c78e3116853b73a9db26aa67700e4ee9af238c93528317491f7b31c56349c6e0be1a66fbd98d9c38137cd2af42d730d6249"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-targetcli-fb-common \
python311-targetcli-fb-common \
python39-targetcli-fb-common \
targetcli-fb-common"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
