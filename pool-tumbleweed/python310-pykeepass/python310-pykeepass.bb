SUMMARY = "Low-level library to interact with keepass databases"
DESCRIPTION = "This library allows you to write entries to a KeePass database"
LICENSE = "GPL-3.0-only"

PV = "4.0.5"

RPM_NAME = "python310-pykeepass-4.0.5-1.2.noarch.rpm"
RPM_HASH = "2621eacc6b292d75a633df991420703646c11dacae2b542ed49a12c9a89fcc4f29de4e25706fdf4ebd892116e57faba90e490cf86f7c68004f3e9bd4a1930853"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pykeepass \
python310-pykeepass \
python3dist-pykeepass"

RDEPENDS:${PN} += "python-abi \
python310-argon2-cffi \
python310-construct \
python310-future \
python310-lxml \
python310-pycryptodomex \
python310-python-dateutil"

inherit rpm
