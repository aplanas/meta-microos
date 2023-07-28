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

RPM_NAME = "python39-PyWebDAV3-GNUHealth-0.12.0-1.1.noarch.rpm"
RPM_HASH = "89c5861c11ed374cd3a655d3183ffe592be164e4edcedf5e1d1458f1251c99e92e25b08ae02d62122d5fdb4c74b272e921a6516ecbd62c10f8c6864876e6cd48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pywebdav3-gnuhealth \
python39-PyWebDAV3-GNUHealth \
python3dist-pywebdav3-gnuhealth"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
