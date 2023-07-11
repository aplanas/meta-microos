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

RPM_NAME = "python310-PyWebDAV3-GNUHealth-0.10.3-1.19.noarch.rpm"
RPM_HASH = "c7853b187531ee30830c1e4044209761ab2038bb6078884ff0edf7ac3d1f2492c4403c6d0516333fbee46715e7ca3040184596802aeb6e929ab77c4b829fa803"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pywebdav3-gnuhealth \
python310-PyWebDAV3-GNUHealth \
python3dist-pywebdav3-gnuhealth"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
