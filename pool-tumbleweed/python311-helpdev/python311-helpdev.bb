SUMMARY = "HelpDev - Extracts information about the Python environment easily"
DESCRIPTION = "HelpDev - Extracts information about the Python environment easily."
LICENSE = "MIT & CC-BY-4.0"

PV = "0.7.1"

RPM_NAME = "python311-helpdev-0.7.1-2.15.noarch.rpm"
RPM_HASH = "432ab8c56d5e3f5409fd69ac005b8ce237bf5ecd1ec4e7945dfa8312eb9841c2ed610330aa70f1daf08fd6ea2525a9e0e98b0f547034cdf4b2721a7276b40438"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-helpdev \
python3.11dist-helpdev \
python311-helpdev \
python3dist-helpdev"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-importlib-metadata \
python311-psutil \
update-alternatives"

inherit rpm
