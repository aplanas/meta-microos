SUMMARY = "Determine if shell has a light or dark background"
DESCRIPTION = "A python module to determine if a shell has a light or dark background."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.1"

RPM_NAME = "python39-term-background-1.0.1-1.8.noarch.rpm"
RPM_HASH = "5d5d85eb415d65d46d986366f00e982221e2aab387a7e64c9d357a05f5c47b014ab96b7600b07e81b10440e5e00270e5e9325de860b9d0f76d71997a9b62fcdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-term-background \
python39-term-background \
python3dist-term-background"

RDEPENDS:${PN} += "python-abi"

inherit rpm
