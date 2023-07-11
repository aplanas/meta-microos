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

PV = "0.10.3"

RPM_NAME = "python39-PyWebDAV3-GNUHealth-0.10.3-1.19.noarch.rpm"
RPM_HASH = "55f32658562427ad16f36afebac9b8c4b64be16eff30e7174b7cad86c6d8acb5042119de85ab3fe8695d2d11f0fd907569fe6c32f255c9866b4fe4ce27c4311c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pywebdav3-gnuhealth \
python39-PyWebDAV3-GNUHealth \
python3dist-pywebdav3-gnuhealth"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
