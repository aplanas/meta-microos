SUMMARY = "SQLAlchemy backend for Telethon session storage"
DESCRIPTION = "SQLAlchemy backend for Telethon session storage"
LICENSE = "MIT"

PV = "0.2.16"

RPM_NAME = "python39-telethon-session-sqlalchemy-0.2.16-1.5.noarch.rpm"
RPM_HASH = "edd9877e30f9a2b3b6b33658295fc20b8c4b088dc8c683ed419bd23ae176d67d221fc5b0cffe5ce3e59d0fb2b6ea078c158c1e2ddc62ee947dc47c166b2d2666"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-telethon-session-sqlalchemy \
python39-telethon-session-sqlalchemy \
python3dist-telethon-session-sqlalchemy"

RDEPENDS:${PN} += "python-abi \
python39-SQLAlchemy"

inherit rpm
