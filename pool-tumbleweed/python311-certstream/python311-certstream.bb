SUMMARY = "Python library for receiving certificate transparency list updates"
DESCRIPTION = "Certstream is a library to connect to the certstream network (certstream.calidog.io). \
 \
It supports automatic reconnection when networks issues occur, and should be stable for long-running jobs."
LICENSE = "MIT"

PV = "1.12"

RPM_NAME = "python311-certstream-1.12-1.11.noarch.rpm"
RPM_HASH = "86c0c8a9e96d094a997b9663f8476dcc54efeab864d940337e553a70689b57411912239513ab15f83287daea2db0f9bcbf70e4f7c844d8709c6172bfc90f4414"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-certstream \
python3.11dist-certstream \
python311-certstream \
python3dist-certstream"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python3-termcolor \
python3-websocket-client \
update-alternatives"

inherit rpm
