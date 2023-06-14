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

RPM_NAME = "python310-PyWebDAV3-GNUHealth-0.10.3-1.17.noarch.rpm"
RPM_HASH = "0b2814c86c0a1ded3674296c5a873eb41d5734eaca89ff7aa7ce85ee99f64076fd59af05436fb09c932bfeabd8066e5ae5bf70843ccce8cf7dcd5f7052e938a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyWebDAV3-GNUHealth \
python3.10dist-pywebdav3-gnuhealth \
python310-PyWebDAV3-GNUHealth \
python3dist-pywebdav3-gnuhealth"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
update-alternatives"

inherit rpm
