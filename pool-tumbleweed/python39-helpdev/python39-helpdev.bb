SUMMARY = "HelpDev - Extracts information about the Python environment easily"
DESCRIPTION = "HelpDev - Extracts information about the Python environment easily."
LICENSE = "MIT & CC-BY-4.0"

PV = "0.7.1"

RPM_NAME = "python39-helpdev-0.7.1-2.15.noarch.rpm"
RPM_HASH = "4314f5fbaca47b2dc658f00ef0321b2da0232d2d3786cffab36b73c51b871229d45cbd8f443700d613a2842277d9e9792bbfd91c33aeb94abdc7734956bc72da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-helpdev \
python39-helpdev \
python3dist-helpdev"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-importlib-metadata \
python39-psutil \
update-alternatives"

inherit rpm
