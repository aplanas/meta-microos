SUMMARY = "WebDAV library including a standalone server for python2 and python3"
DESCRIPTION = "WebDAV library for python2 and python3. \
 \
Consists of a server that is ready to run Serve and the DAV package \
that provides WebDAV server functionality. \
 \
This package does not provide client functionality."
LICENSE = "LGPL-2.0-only"

PV = "0.9.14"

RPM_NAME = "python39-PyWebDAV3-0.9.14-1.18.noarch.rpm"
RPM_HASH = "70e03e3da8f7551a0f2d7f8d1e9d27c7b123dd9aa715e4791b2615962704c35ce9136cd609617e3ebe8e5412af0be28b2f00ea73ff954ac42c256d5f889d0c11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pywebdav3 \
python39-PyWebDAV3 \
python3dist-pywebdav3"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-six \
update-alternatives"

inherit rpm
