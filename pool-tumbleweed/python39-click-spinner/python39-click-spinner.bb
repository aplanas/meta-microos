SUMMARY = "Spinner for Click"
DESCRIPTION = "Spinner for Click."
LICENSE = "MIT"

PV = "0.1.10"

RPM_NAME = "python39-click-spinner-0.1.10-2.5.noarch.rpm"
RPM_HASH = "0ffafc6092e858cc05952d559c62d50d765d6d63eb119cf647ebc3b0a445792bee2ac4269c54cd9d8545b27e398c92e537297fcb998929c34d1c836ac2e068b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-click-spinner \
python39-click-spinner \
python3dist-click-spinner"

RDEPENDS:${PN} += "python-abi \
python39-click"

inherit rpm
