SUMMARY = "Python library for receiving certificate transparency list updates"
DESCRIPTION = "Certstream is a library to connect to the certstream network (certstream.calidog.io). \
 \
It supports automatic reconnection when networks issues occur, and should be stable for long-running jobs."
LICENSE = "MIT"

PV = "1.12"

RPM_NAME = "python39-certstream-1.12-1.11.noarch.rpm"
RPM_HASH = "fcff5dd6098d19516c257e425f1a29b5451d99c1f71f8324e0d86d1bac6f7fb73b7639039c6511dfc94e984e16ea956236de77ac8a586f8e13678372d5087992"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-certstream \
python39-certstream \
python3dist-certstream"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python3-termcolor \
python3-websocket-client \
update-alternatives"

inherit rpm
