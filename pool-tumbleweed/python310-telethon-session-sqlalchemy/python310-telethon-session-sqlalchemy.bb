SUMMARY = "SQLAlchemy backend for Telethon session storage"
DESCRIPTION = "SQLAlchemy backend for Telethon session storage"
LICENSE = "MIT"

PV = "0.2.16"

RPM_NAME = "python310-telethon-session-sqlalchemy-0.2.16-1.5.noarch.rpm"
RPM_HASH = "8c9d6d2654d38082a8b5b2781066041fa8b32decb09ab674738f81de0fa03b10712d9336bd06c70658e14f9a9785c4964b5cfe2e90f869fb4d46f247a9360dd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-telethon-session-sqlalchemy \
python310-telethon-session-sqlalchemy \
python3dist-telethon-session-sqlalchemy"

RDEPENDS:${PN} += "python-abi \
python310-SQLAlchemy"

inherit rpm
