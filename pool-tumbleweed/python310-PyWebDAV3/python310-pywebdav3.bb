SUMMARY = "WebDAV library including a standalone server for python2 and python3"
DESCRIPTION = "WebDAV library for python2 and python3. \
 \
Consists of a server that is ready to run Serve and the DAV package \
that provides WebDAV server functionality. \
 \
This package does not provide client functionality."
LICENSE = "LGPL-2.0-only"

PV = "0.9.14"

RPM_NAME = "python310-PyWebDAV3-0.9.14-1.16.noarch.rpm"
RPM_HASH = "2cc20801340c48e9facdc7d8bcaed03794af5e5d912f0fa5bb8c5b6b56ec3205be0314ed4cc308759d35a87dec261e7733e567d97ac27136a24e195b01a22eaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyWebDAV3 \
python3.10dist-pywebdav3 \
python310-PyWebDAV3 \
python3dist-pywebdav3"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-six \
update-alternatives"

inherit rpm
