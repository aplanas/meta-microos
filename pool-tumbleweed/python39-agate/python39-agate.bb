SUMMARY = "Data analysis library optimized for humans instead of machines"
DESCRIPTION = "Agate is a Python data analysis library that is optimized for humans \
instead of machines. It is an alternative to numpy and pandas that \
solves real-world problems with readable code. \
 \
Agate was previously known as journalism."
LICENSE = "MIT"

PV = "1.7.1"

RPM_NAME = "python39-agate-1.7.1-2.4.noarch.rpm"
RPM_HASH = "d00fb3fe361418ec79995c96917ed790f8b9578aa395624b4a7c6ae9414f12c3e27f9ab615e9166e7aeb74042f91ee3126b71c0e7b60d1971a4671cdd77bc28a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-agate \
python39-agate \
python3dist-agate"

RDEPENDS:${PN} += "python-abi \
python39-Babel \
python39-isodate \
python39-leather \
python39-parsedatetime \
python39-python-slugify \
python39-pytimeparse"

inherit rpm
