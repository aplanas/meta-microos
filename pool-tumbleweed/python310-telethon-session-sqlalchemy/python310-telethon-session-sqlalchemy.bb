SUMMARY = "SQLAlchemy backend for Telethon session storage"
DESCRIPTION = "SQLAlchemy backend for Telethon session storage"
LICENSE = "MIT"

PV = "0.2.16"

RPM_NAME = "python310-telethon-session-sqlalchemy-0.2.16-1.3.noarch.rpm"
RPM_HASH = "fb7bb9675f20fe8a90650b9b0a55309279bebb3b1b54c3e17c4aa0a0752de2cf1630b7d8f1d5707491410eaa55bf9071d13896554d2b89d386ce7b0a67ffcf89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-telethon-session-sqlalchemy \
python3.10dist-telethon-session-sqlalchemy \
python310-telethon-session-sqlalchemy \
python3dist-telethon-session-sqlalchemy"

RDEPENDS:${PN} += "python-abi \
python310-SQLAlchemy"

inherit rpm
