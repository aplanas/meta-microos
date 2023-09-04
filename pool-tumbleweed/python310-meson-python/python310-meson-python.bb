SUMMARY = "Meson Python build backend (PEP 517)"
DESCRIPTION = "Python build backend (PEP 517) for Meson projects."
LICENSE = "MIT"

PV = "0.13.2"

RPM_NAME = "python310-meson-python-0.13.2-1.1.noarch.rpm"
RPM_HASH = "daa7145096b3f526ac3134ebf409d87f53bcc1c78932ab2ad6008dc91935337eead52c8c4f921e6058fbce0e6074b1f9ebb98a96d779c5b7c1c5d5fa4787da56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-meson-python \
python310-meson-python \
python3dist-meson-python"

RDEPENDS:${PN} += "meson \
python-abi \
python310-pyproject-metadata \
python310-tomli"

inherit rpm
