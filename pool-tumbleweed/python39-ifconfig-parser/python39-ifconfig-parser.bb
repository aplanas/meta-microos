SUMMARY = "Python package for parsing raw output of ifconfig"
DESCRIPTION = "Python package for parsing raw output of ifconfig."
LICENSE = "MIT"

PV = "0.0.5"

RPM_NAME = "python39-ifconfig-parser-0.0.5-1.15.noarch.rpm"
RPM_HASH = "99b20cd40e4fad1e1012e026d6ee1a0928f6ae630e60c3774299c06261b59843a80b018bdde576b2de0bc4bcad658a405f57b0b6a2b321732bf003fa35c23b49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ifconfig-parser \
python39-ifconfig-parser \
python3dist-ifconfig-parser"

RDEPENDS:${PN} += "python-abi"

inherit rpm
