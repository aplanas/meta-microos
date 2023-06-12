SUMMARY = "ANSI text color library for Python"
DESCRIPTION = "Yet another ANSI color text library for Python. It provides 'auto \
colors' for dark/light terminals. \
 \
In Python 2.x, this library subclasses `unicode`, while on \
Python 3.x, it subclasses `str`."
LICENSE = "MIT"

PV = "2.2.2"

RPM_NAME = "python310-colorclass-2.2.2-2.1.noarch.rpm"
RPM_HASH = "938acf185a1ecc0c5d5a97d8f23d03f7276ba4f354297a9805e39952387d1268c3096e676a69f7b2bada80d77d8c44abec4467e28e2565ebdc9a3b4dcefc70ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-colorclass \
python3.10dist(colorclass) \
python310-colorclass \
python3dist(colorclass)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
