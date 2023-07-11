SUMMARY = "Data analysis library optimized for humans instead of machines"
DESCRIPTION = "Agate is a Python data analysis library that is optimized for humans \
instead of machines. It is an alternative to numpy and pandas that \
solves real-world problems with readable code. \
 \
Agate was previously known as journalism."
LICENSE = "MIT"

PV = "1.7.1"

RPM_NAME = "python310-agate-1.7.1-2.4.noarch.rpm"
RPM_HASH = "550e7d177320376ed278ff81cd268f6b15f245c1194472e2a4865ce9fdeecee426db5fc2953a73ae95e7c03317f164fe254bfb8fd0a51994f61b60ef4050f21a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-agate \
python310-agate \
python3dist-agate"

RDEPENDS:${PN} += "python-abi \
python310-Babel \
python310-isodate \
python310-leather \
python310-parsedatetime \
python310-python-slugify \
python310-pytimeparse"

inherit rpm
