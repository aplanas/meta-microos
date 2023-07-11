SUMMARY = "Filesystem events monitoring"
DESCRIPTION = "Python API and shell utilities to monitor file system events."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "python310-watchdog-3.0.0-2.3.noarch.rpm"
RPM_HASH = "440b1771a644e1b08496d3be717c276e78704718d2b85118e1923c08ea418ae8fbb8910a5dd46377ab8ac76fce544c448f2265f8956ee7e50ac65508469b6c2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-watchdog \
python310-watchdog \
python3dist-watchdog"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-PyYAML \
python310-pathtools \
update-alternatives"

inherit rpm
