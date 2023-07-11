SUMMARY = "Improvements over the standard pathlib module and pathlib2 package"
DESCRIPTION = "Improvements over the standard pathlib module and pathlib2 package."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "python310-ruamel.std.pathlib-0.9.2-2.4.noarch.rpm"
RPM_HASH = "0ea4288894304480b884ced62285bbf51dd54ac74457ae39df5c86c4c56da80d06ec5751ed32973bc174860af643cfe5e4c8f44c902871864f7dfce7d10cde1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ruamel.std.pathlib \
python310-ruamel.std.pathlib \
python3dist-ruamel.std.pathlib"

RDEPENDS:${PN} += "python-abi \
python310-ruamel.base"

inherit rpm
