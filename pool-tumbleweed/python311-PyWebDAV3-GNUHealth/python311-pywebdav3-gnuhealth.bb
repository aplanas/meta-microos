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

RPM_NAME = "python311-PyWebDAV3-GNUHealth-0.10.3-1.19.noarch.rpm"
RPM_HASH = "a256982671e1d152180fb84bfdf53b65b5ac6152ce550969fc380c112c1097471ca79bebbea9f68a7cd07deabb6fdd7471e00658b1d9fafdb1179b249f4816e4"
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
