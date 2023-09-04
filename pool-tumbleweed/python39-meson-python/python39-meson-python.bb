SUMMARY = "Meson Python build backend (PEP 517)"
DESCRIPTION = "Python build backend (PEP 517) for Meson projects."
LICENSE = "MIT"

PV = "0.13.2"

RPM_NAME = "python39-meson-python-0.13.2-1.1.noarch.rpm"
RPM_HASH = "2c80087ea7bf77cbab944e6a52a82cc3e7f08cebb82b11e08bfe885dd434b5962809206617e7dc02bb3429ffa41c7b6d0d55e48553fec5d62e5b3eb92fb496c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-meson-python \
python39-meson-python \
python3dist-meson-python"

RDEPENDS:${PN} += "meson \
python-abi \
python39-pyproject-metadata \
python39-tomli \
python39-typing-extensions"

inherit rpm
