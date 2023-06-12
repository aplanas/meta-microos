SUMMARY = "Python library for receiving certificate transparency list updates"
DESCRIPTION = "Certstream is a library to connect to the certstream network (certstream.calidog.io). \
 \
It supports automatic reconnection when networks issues occur, and should be stable for long-running jobs."
LICENSE = "MIT"

PV = "1.12"

RPM_NAME = "python39-certstream-1.12-1.9.noarch.rpm"
RPM_HASH = "5728a6c61fa1a71fa4fc2e15059833087787e47bd90681f95d3a33d4b944556daf4a034697779b6a63485ae24a9cd494176aa9334039c551d10b37df72339176"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(certstream) \
python39-certstream \
python3dist(certstream)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python3-termcolor \
python3-websocket-client \
update-alternatives"

inherit rpm
