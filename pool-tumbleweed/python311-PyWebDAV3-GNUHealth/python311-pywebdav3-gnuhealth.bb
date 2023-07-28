SUMMARY = "WebDAV library for Python - GNU Health port"
DESCRIPTION = "This is a Python WebDAV implementation (level 1 and 2) that \
features a library for integrating WebDAV server capabilities \
into applications. \
 \
An example on how to use the library is included. This server \
can be run as daemon. \
 \
Port from Andrew Leech PyWebDAV3 library to Support GNU Health."
LICENSE = "GPL-3.0-or-later"

PV = "0.12.0"

RPM_NAME = "python311-PyWebDAV3-GNUHealth-0.12.0-1.1.noarch.rpm"
RPM_HASH = "efe34692f61e1342ccc5429bf4b130314818a8b3ae0e9cf1d1d6a8ecafd76edf2dc011e36e766ae60b7658aa01dcc54097c83f4351360dcc5b762efa1de0ecff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyWebDAV3-GNUHealth \
python3.11dist-pywebdav3-gnuhealth \
python311-PyWebDAV3-GNUHealth \
python3dist-pywebdav3-gnuhealth"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
