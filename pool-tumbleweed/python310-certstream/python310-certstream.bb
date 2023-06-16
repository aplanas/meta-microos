SUMMARY = "Python library for receiving certificate transparency list updates"
DESCRIPTION = "Certstream is a library to connect to the certstream network (certstream.calidog.io). \
 \
It supports automatic reconnection when networks issues occur, and should be stable for long-running jobs."
LICENSE = "MIT"

PV = "1.12"

RPM_NAME = "python310-certstream-1.12-1.9.noarch.rpm"
RPM_HASH = "672eeb332fa1f66fc15c1db1c552f6aea63235c65681387896e1f0d939614a66511df41e92bd766dd889dc4101a611f7f76eacfe5b1dc35590ee932c50ae897b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-certstream \
python3.10dist-certstream \
python310-certstream \
python3dist-certstream"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python3-termcolor \
python3-websocket-client \
update-alternatives"

inherit rpm
