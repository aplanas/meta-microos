SUMMARY = "Changelog link and timestamp adding Sphinx plugin"
DESCRIPTION = "rst.linker is a Sphinx plugin to add links and timestamps to the \
changelog."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "python39-rst.linker-2.4.0-1.3.noarch.rpm"
RPM_HASH = "d4dd273f6702d99a20a69268edc83e7d8c538e2d983f87153a477061bcf44a7208b352293f05d7288701236f5358815ea94af8be6d8f7abf1e5170ccc0cf5f95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-rst.linker \
python39-rst.linker \
python3dist-rst.linker"

RDEPENDS:${PN} += "python-abi \
python39-python-dateutil"

inherit rpm
