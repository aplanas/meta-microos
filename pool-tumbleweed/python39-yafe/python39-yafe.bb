SUMMARY = "Yet Another Framework for Experiments"
DESCRIPTION = "The package yafe offers a generic framework to conduct \
scientific experiments."
LICENSE = "GPL-3.0-only"

PV = "1.0.3"

RPM_NAME = "python39-yafe-1.0.3-2.8.noarch.rpm"
RPM_HASH = "0c722a7d5e872ac5a6b145d44cd702ecbcd581fe1e11b4bf4e7b84179afedfa716ea7f6320457d59a18f70fc1e086b196d2f0558b3eaac39760f3fa2dd317746"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-yafe \
python39-yafe \
python3dist-yafe"

RDEPENDS:${PN} += "python-abi \
python39-numpy"

inherit rpm
