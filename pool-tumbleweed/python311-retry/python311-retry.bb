SUMMARY = "Python retry decorator"
DESCRIPTION = "Easy to use retry decorator."
LICENSE = "Apache-2.0"

PV = "0.9.2"

RPM_NAME = "python311-retry-0.9.2-3.8.noarch.rpm"
RPM_HASH = "7694bf9e4394a930fbed094153d06c536ab4ba3453df9958bfa0a8524e921d7403d0b67221d002175774053c294e61fd82ed638b706b585111fbfef065bb97b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-retry \
python3.11dist-retry \
python311-retry \
python3dist-retry"

RDEPENDS:${PN} += "python-abi \
python311-decorator \
python311-py"

inherit rpm
