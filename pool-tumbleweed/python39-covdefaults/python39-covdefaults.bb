SUMMARY = "Python coverage plugin to provide default settings"
DESCRIPTION = "Python coverage plugin to provide default settings."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python39-covdefaults-2.3.0-1.2.noarch.rpm"
RPM_HASH = "c8e151c119efcc84b8e02dbff4be0e374f35f82e9fc5eafeacdd291902f72b3a2bbd244f830b614c832d886b85e98a86399d03beeadbb55471af33ea9eebb871"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-covdefaults \
python39-covdefaults \
python3dist-covdefaults"

RDEPENDS:${PN} += "python-abi \
python39-coverage"

inherit rpm
