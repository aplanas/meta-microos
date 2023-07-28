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

RPM_NAME = "python310-PyWebDAV3-GNUHealth-0.12.0-1.1.noarch.rpm"
RPM_HASH = "940edd48aed6c3b8b09f26b63a62605e14caaa7cedbfaa4e54edc938dd0f50572cf240df8d7e21f7fb52e11325b294f480a49b4f874c12b5ed5ea0b4143ebfa4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pywebdav3-gnuhealth \
python310-PyWebDAV3-GNUHealth \
python3dist-pywebdav3-gnuhealth"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
