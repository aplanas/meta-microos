SUMMARY = "WebDAV library including a standalone server for python2 and python3"
DESCRIPTION = "WebDAV library for python2 and python3. \
 \
Consists of a server that is ready to run Serve and the DAV package \
that provides WebDAV server functionality. \
 \
This package does not provide client functionality."
LICENSE = "LGPL-2.0-only"

PV = "0.9.14"

RPM_NAME = "python310-PyWebDAV3-0.9.14-1.18.noarch.rpm"
RPM_HASH = "17944fd348229759f7cb58beba9b87492a4b9d9762bd74c742af30d1da6322c17f492c9e840db2e696f6aa9ffbe578b4c1d9c6f75a3798a2dabf1f0895c9e498"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pywebdav3 \
python310-PyWebDAV3 \
python3dist-pywebdav3"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-six \
update-alternatives"

inherit rpm
