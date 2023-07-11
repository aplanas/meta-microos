SUMMARY = "Changelog link and timestamp adding Sphinx plugin"
DESCRIPTION = "rst.linker is a Sphinx plugin to add links and timestamps to the \
changelog."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "python311-rst.linker-2.4.0-1.3.noarch.rpm"
RPM_HASH = "026bd654916b4bb79b9707ab0fa993b22ae87e2532cfdbeebced76e246db7d5c5c888ef77e47e4cad30bea1a81a71f5a7b5c6b13749bc141e12e78e968a2878a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rst.linker \
python3.11dist-rst.linker \
python311-rst.linker \
python3dist-rst.linker"

RDEPENDS:${PN} += "python-abi \
python311-python-dateutil"

inherit rpm
