SUMMARY = "Configuration validator producing human readable error messages"
DESCRIPTION = "A configuration validator for Python that produce human readable error messages."
LICENSE = "MIT"

PV = "3.3.1"

RPM_NAME = "python311-cfgv-3.3.1-1.8.noarch.rpm"
RPM_HASH = "51f1f9a8956a9e50598a40a210bdba001d5fb9e3ae5ac58e9fd5688127338ed4d6b88d0b90a5f163489ce1c7c720cc85c0a8fe4c94ba8ff268ce2c6cfc1d3382"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cfgv \
python3.11dist-cfgv \
python311-cfgv \
python3dist-cfgv"

RDEPENDS:${PN} += "python-abi"

inherit rpm
