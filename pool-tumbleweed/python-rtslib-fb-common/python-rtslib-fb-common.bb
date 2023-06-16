SUMMARY = "Common python-rtslib-fb subpackage for Python 2 or 3"
DESCRIPTION = "python-rtslib-fb-common is the invariant base package needed by both \
python2-rtslib-fb and python3-rtslib-fb."
LICENSE = "Apache-2.0"

PV = "2.1.75"

RPM_NAME = "python-rtslib-fb-common-2.1.75-3.1.noarch.rpm"
RPM_HASH = "3efe7c170f83da31bb4748897715a8e519818774622885157413e8547cb4a918a8b2e6b732982a7daa842f72f289282a0a7b346365426d76eda567da5e0dd656"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-rtslib-fb-common"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
