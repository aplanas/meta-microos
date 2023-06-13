SUMMARY = "WebDAV library including a standalone server for python2 and python3"
DESCRIPTION = "WebDAV library for python2 and python3. \
 \
Consists of a server that is ready to run Serve and the DAV package \
that provides WebDAV server functionality. \
 \
This package does not provide client functionality."
LICENSE = "LGPL-2.0-only"

PV = "0.9.14"

RPM_NAME = "python39-PyWebDAV3-0.9.14-1.16.noarch.rpm"
RPM_HASH = "fd4d8ea5655322d2c58bdc8256b76af362a1a68717b608e13759e574520449226ddcfbbc68d1af7cc9132a19e7184263c4d298d269940fbd6d196fa8525961f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pywebdav3) \
python39-PyWebDAV3 \
python3dist(pywebdav3)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-six \
update-alternatives"

inherit rpm
