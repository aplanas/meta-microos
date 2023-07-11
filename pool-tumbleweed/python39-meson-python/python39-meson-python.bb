SUMMARY = "Meson Python build backend (PEP 517)"
DESCRIPTION = "Python build backend (PEP 517) for Meson projects."
LICENSE = "MIT"

PV = "0.12.1"

RPM_NAME = "python39-meson-python-0.12.1-2.2.noarch.rpm"
RPM_HASH = "920b79079a70a1aeccca2663c3eca165bd5937be1a7738a80db3b8bdf4ef414355c2c01a8dc1415ac49a216e91e4e96b5617314f40e37774e5c44e5991e827c5"
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
