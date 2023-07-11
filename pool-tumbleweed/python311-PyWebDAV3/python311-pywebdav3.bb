SUMMARY = "WebDAV library including a standalone server for python2 and python3"
DESCRIPTION = "WebDAV library for python2 and python3. \
 \
Consists of a server that is ready to run Serve and the DAV package \
that provides WebDAV server functionality. \
 \
This package does not provide client functionality."
LICENSE = "LGPL-2.0-only"

PV = "0.9.14"

RPM_NAME = "python311-PyWebDAV3-0.9.14-1.18.noarch.rpm"
RPM_HASH = "7fa210bd2afefcdb1cdd6b6246ca4d300bd8d09721cff300df87441cb36d11954b9e7ed50289c183fc16342352d0982dea0cbeb7568b8a46ca5a1b8eccfcedb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyWebDAV3 \
python3.11dist-pywebdav3 \
python311-PyWebDAV3 \
python3dist-pywebdav3"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-six \
update-alternatives"

inherit rpm
