SUMMARY = "Determine if shell has a light or dark background"
DESCRIPTION = "A python module to determine if a shell has a light or dark background."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.1"

RPM_NAME = "python310-term-background-1.0.1-1.8.noarch.rpm"
RPM_HASH = "5fa2aba5c7083433b5e83f8fea940ad852099f0a346aea3503d4adedef40be71c44ad2281e81cc554e10caead215c4ca9376c542b0e8e570a68bf9f58cd84392"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-term-background \
python310-term-background \
python3dist-term-background"

RDEPENDS:${PN} += "python-abi"

inherit rpm
