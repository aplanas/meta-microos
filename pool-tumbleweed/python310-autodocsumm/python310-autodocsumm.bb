SUMMARY = "Extended sphinx autodoc including automatic autosummaries"
DESCRIPTION = "Extended sphinx autodoc including automatic autosummaries"
LICENSE = "Apache-2.0"

PV = "0.2.11"

RPM_NAME = "python310-autodocsumm-0.2.11-2.3.noarch.rpm"
RPM_HASH = "40e4db310163593c91746b44f478993588a7a7b87b2783f0589aaf4af696ddca3952e683a8d78f919f6521c0eda0a4e3da741e6f1488c3274e337f4c25d55650"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-autodocsumm \
python310-autodocsumm \
python3dist-autodocsumm"

RDEPENDS:${PN} += "python-abi \
python310-Sphinx"

inherit rpm
