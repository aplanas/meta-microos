SUMMARY = "ANSI text color library for Python"
DESCRIPTION = "Yet another ANSI color text library for Python. It provides 'auto \
colors' for dark/light terminals. \
 \
In Python 2.x, this library subclasses `unicode`, while on \
Python 3.x, it subclasses `str`."
LICENSE = "MIT"

PV = "2.2.2"

RPM_NAME = "python39-colorclass-2.2.2-2.3.noarch.rpm"
RPM_HASH = "1028cf3ba7ba8d33ba59a25afc70499626608c4d6b77342fefa1733c68fc27711405dcd0d2aeb1055b8a056dce632882cafeed8b6d2c32d7c4dc23f9a3a2d708"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-colorclass \
python39-colorclass \
python3dist-colorclass"

RDEPENDS:${PN} += "python-abi"

inherit rpm
