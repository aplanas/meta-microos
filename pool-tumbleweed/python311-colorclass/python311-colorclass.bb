SUMMARY = "ANSI text color library for Python"
DESCRIPTION = "Yet another ANSI color text library for Python. It provides 'auto \
colors' for dark/light terminals. \
 \
In Python 2.x, this library subclasses `unicode`, while on \
Python 3.x, it subclasses `str`."
LICENSE = "MIT"

PV = "2.2.2"

RPM_NAME = "python311-colorclass-2.2.2-2.3.noarch.rpm"
RPM_HASH = "6d2e42dbd9a279e5c94da79e771efbd0513304074ad2f2b0778da3b1cdec83a9ba7d90a9061c3f9de87293295582ea37a83ca7e5b553e663555001935f08c18b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-colorclass \
python3.11dist-colorclass \
python311-colorclass \
python3dist-colorclass"

RDEPENDS:${PN} += "python-abi"

inherit rpm
