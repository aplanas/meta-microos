SUMMARY = "Pathlib-compatible object wrapper for zip files"
DESCRIPTION = "A pathlib-compatible Zipfile object wrapper."
LICENSE = "MIT"

PV = "3.15.0"

RPM_NAME = "python310-zipp-3.15.0-2.1.noarch.rpm"
RPM_HASH = "dfd6e408cbab8e888052fd3c329e458ecb4a896fe548a568d61a793e5185845a7d56694be497aababe748900cdce416f7ed5570944a01be6666dab178643b9aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zipp \
python3.10dist(zipp) \
python310-zipp \
python3dist(zipp)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
