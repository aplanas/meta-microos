SUMMARY = "Configuration validator producing human readable error messages"
DESCRIPTION = "A configuration validator for Python that produce human readable error messages."
LICENSE = "MIT"

PV = "3.3.1"

RPM_NAME = "python39-cfgv-3.3.1-1.8.noarch.rpm"
RPM_HASH = "a53c51865cf3ff7cfa660ecea877bad03ec432b26a6ddc58fa6644b9441c9c853d642facc4b945a973688a72eb33f2c63bfbd91f0553e30e628db5b8c4ce819c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cfgv \
python39-cfgv \
python3dist-cfgv"

RDEPENDS:${PN} += "python-abi"

inherit rpm
