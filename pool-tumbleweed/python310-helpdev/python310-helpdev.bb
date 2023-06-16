SUMMARY = "HelpDev - Extracts information about the Python environment easily"
DESCRIPTION = "HelpDev - Extracts information about the Python environment easily."
LICENSE = "MIT & CC-BY-4.0"

PV = "0.7.1"

RPM_NAME = "python310-helpdev-0.7.1-2.13.noarch.rpm"
RPM_HASH = "8a5589761dc1a2df45b7faabf7e13783acf4f83dff74ba5380695461602fd4386e603cc1aea128eb32c8ada648ed8bb44782ae293abd9e380b193a0abad7ad6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-helpdev \
python3.10dist-helpdev \
python310-helpdev \
python3dist-helpdev"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-importlib-metadata \
python310-psutil \
update-alternatives"

inherit rpm
