SUMMARY = "HelpDev - Extracts information about the Python environment easily"
DESCRIPTION = "HelpDev - Extracts information about the Python environment easily."
LICENSE = "MIT & CC-BY-4.0"

PV = "0.7.1"

RPM_NAME = "python311-helpdev-0.7.1-2.13.noarch.rpm"
RPM_HASH = "a4a651b13e9449ffbd2391f5885886617cfbf1dd7d3b5a1b8cb93163b77184b8b928a20d12053e3a707a79b426b2caed7054bc4fa5e6d4844e148969ab6a313f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(helpdev) \
python311-helpdev \
python3dist(helpdev)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-importlib-metadata \
python311-psutil \
update-alternatives"

inherit rpm
