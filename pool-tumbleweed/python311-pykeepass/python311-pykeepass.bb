SUMMARY = "Low-level library to interact with keepass databases"
DESCRIPTION = "This library allows you to write entries to a KeePass database"
LICENSE = "GPL-3.0-only"

PV = "4.0.5"

RPM_NAME = "python311-pykeepass-4.0.5-1.2.noarch.rpm"
RPM_HASH = "284f3df390fb265d9f1c4642f9c85cf935e2939b33844ebf536df8fde763764086fd6640cdd4aba5100ed3dd681598e1274382c01dde2b01dff71f2142880f7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pykeepass \
python3.11dist-pykeepass \
python311-pykeepass \
python3dist-pykeepass"

RDEPENDS:${PN} += "python-abi \
python311-argon2-cffi \
python311-construct \
python311-future \
python311-lxml \
python311-pycryptodomex \
python311-python-dateutil"

inherit rpm
