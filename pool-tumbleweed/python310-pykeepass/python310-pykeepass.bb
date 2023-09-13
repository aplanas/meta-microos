SUMMARY = "Low-level library to interact with keepass databases"
DESCRIPTION = "This library allows you to write entries to a KeePass database"
LICENSE = "GPL-3.0-only"

PV = "4.0.6"

RPM_NAME = "python310-pykeepass-4.0.6-1.1.noarch.rpm"
RPM_HASH = "f02394b60f2ac08fec7212e59b98416fbf0c9f47170953fc01c86e5c765c574edeab9c1ab30a37adcfe085d1e4f141ab2abd62cf6b140042b5029324602862e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pykeepass \
python310-pykeepass \
python3dist-pykeepass"

RDEPENDS:${PN} += "python-abi \
python310-argon2-cffi \
python310-construct \
python310-lxml \
python310-pycryptodomex \
python310-python-dateutil"

inherit rpm
