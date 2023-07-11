SUMMARY = "Python library for receiving certificate transparency list updates"
DESCRIPTION = "Certstream is a library to connect to the certstream network (certstream.calidog.io). \
 \
It supports automatic reconnection when networks issues occur, and should be stable for long-running jobs."
LICENSE = "MIT"

PV = "1.12"

RPM_NAME = "python310-certstream-1.12-1.11.noarch.rpm"
RPM_HASH = "57ec1809d68ef128e73b509bc3b1bc27850c1e502c1cf12f48d6285e6dae70b7471748f21eb08acaef889ce24f5670f3ac1607f8a36cab47d097448ab03eb119"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-certstream \
python310-certstream \
python3dist-certstream"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python3-termcolor \
python3-websocket-client \
update-alternatives"

inherit rpm
