SUMMARY = "The Python 'ana' module"
DESCRIPTION = "A Python module that provides an undocumented data layer for Python objects."
LICENSE = "BSD-2-Clause"

PV = "0.06"

RPM_NAME = "python311-ana-0.06-3.5.noarch.rpm"
RPM_HASH = "0221794b7c7bb7987956034e1d155f3a8fbcc7671232565626c749ef024c5827f64030d30299022708c97bc11d4df09d7f1396429b127818aee2e4915729faac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ana \
python3.11dist-ana \
python311-ana \
python3dist-ana"

RDEPENDS:${PN} += "python-abi \
python311-future"

inherit rpm
