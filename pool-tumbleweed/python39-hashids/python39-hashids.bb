SUMMARY = "Python implementation of hashids"
DESCRIPTION = "Python implementation of hashids (http://www.hashids.org)."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "python39-hashids-1.3.1-1.20.noarch.rpm"
RPM_HASH = "b788e319f6aacd86d896174a7231747747fff2508e56e1962a6b18ebf42b9bba5f10376125d80069a6752863f8b0fa29e1b33f245c184bfaa707b56a18f77e0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-hashids \
python39-hashids \
python3dist-hashids"

RDEPENDS:${PN} += "python-abi"

inherit rpm
