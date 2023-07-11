SUMMARY = "Python coverage plugin to provide default settings"
DESCRIPTION = "Python coverage plugin to provide default settings."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python311-covdefaults-2.3.0-2.3.noarch.rpm"
RPM_HASH = "85eabea0e69ca76257374f65e0220e6e8e878adf8af46f21703a51761f66b7108647b2e1ae8b1e1c4850540f472f7caf57c0ecc68f592c0755ccd3f2d1005813"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-covdefaults \
python3.11dist-covdefaults \
python311-covdefaults \
python3dist-covdefaults"

RDEPENDS:${PN} += "python-abi \
python311-coverage"

inherit rpm
