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

RPM_NAME = "python39-PyWebDAV3-GNUHealth-0.10.3-1.17.noarch.rpm"
RPM_HASH = "f40dbc1ef08c0fa9c8e8e9cc47c675c789233f7523b05ffcf935ad0a44cbdbd011f0779121d068eb1e3b78edfd5c40f0c93fc0d2d5c3f3abe4d780f473dcd5de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pywebdav3-gnuhealth) \
python39-PyWebDAV3-GNUHealth \
python3dist(pywebdav3-gnuhealth)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
update-alternatives"

inherit rpm
