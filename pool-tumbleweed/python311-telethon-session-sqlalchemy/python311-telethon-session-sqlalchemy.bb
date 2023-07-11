SUMMARY = "SQLAlchemy backend for Telethon session storage"
DESCRIPTION = "SQLAlchemy backend for Telethon session storage"
LICENSE = "MIT"

PV = "0.2.16"

RPM_NAME = "python311-telethon-session-sqlalchemy-0.2.16-1.5.noarch.rpm"
RPM_HASH = "492cf92f3edca434dc3221311f33b1e442ca6a42e3f42e9dac3a542e57b5f1d3b1662697912119bc75114d2612f4af7a505f6933f37dc37c813a8a8b6834f0ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-telethon-session-sqlalchemy \
python3.11dist-telethon-session-sqlalchemy \
python311-telethon-session-sqlalchemy \
python3dist-telethon-session-sqlalchemy"

RDEPENDS:${PN} += "python-abi \
python311-SQLAlchemy"

inherit rpm
