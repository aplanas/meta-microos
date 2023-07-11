SUMMARY = "HelpDev - Extracts information about the Python environment easily"
DESCRIPTION = "HelpDev - Extracts information about the Python environment easily."
LICENSE = "MIT & CC-BY-4.0"

PV = "0.7.1"

RPM_NAME = "python310-helpdev-0.7.1-2.15.noarch.rpm"
RPM_HASH = "7440a490c51a1686c98679262de8e0fa64d6b87b6cd45a389c6e1a383074466428cece6ceaa45afc3bcdf64b05055a2c54456d3c83c412294e5ba68ae92f8ea7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-helpdev \
python310-helpdev \
python3dist-helpdev"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-importlib-metadata \
python310-psutil \
update-alternatives"

inherit rpm
