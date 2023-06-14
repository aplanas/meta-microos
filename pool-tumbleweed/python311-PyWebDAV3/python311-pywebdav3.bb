SUMMARY = "WebDAV library including a standalone server for python2 and python3"
DESCRIPTION = "WebDAV library for python2 and python3. \
 \
Consists of a server that is ready to run Serve and the DAV package \
that provides WebDAV server functionality. \
 \
This package does not provide client functionality."
LICENSE = "LGPL-2.0-only"

PV = "0.9.14"

RPM_NAME = "python311-PyWebDAV3-0.9.14-1.16.noarch.rpm"
RPM_HASH = "fc6ae21c8d3e15a6bb8d21202c626c3d76a2e35b86f6eb45fbf4eb52641f441a4bc70bb2a1c1d9fb8f3c18662bfed486de98a96a46d6cb6143d0afa3ffe06488"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pywebdav3 \
python311-PyWebDAV3 \
python3dist-pywebdav3"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-six \
update-alternatives"

inherit rpm
