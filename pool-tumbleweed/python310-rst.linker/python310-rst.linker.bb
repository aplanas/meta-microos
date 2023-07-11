SUMMARY = "Changelog link and timestamp adding Sphinx plugin"
DESCRIPTION = "rst.linker is a Sphinx plugin to add links and timestamps to the \
changelog."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "python310-rst.linker-2.4.0-1.3.noarch.rpm"
RPM_HASH = "acdef15318f698f4f1cab36f8f26824bf065494b0eba9fb4b940413d8d02ad4b3fb735dbdacc691d2f7dd1a4337e9fc0865a54e8a958f495f829a5356522c411"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-rst.linker \
python310-rst.linker \
python3dist-rst.linker"

RDEPENDS:${PN} += "python-abi \
python310-python-dateutil"

inherit rpm
