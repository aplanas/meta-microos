SUMMARY = "Python Data Validation"
DESCRIPTION = "Python Data Validation for Humans."
LICENSE = "MIT"

PV = "0.20.0"

RPM_NAME = "python311-validators-0.20.0-3.3.noarch.rpm"
RPM_HASH = "adcd7c4f428e1ede063e8f1ca22616b6cbf14345311394ebda945e141b130f21fe2b6339d616ffd0492cc026e514afab39f62f0f4d9734321df1cacaf2b3f9b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-validators \
python3.11dist-validators \
python311-validators \
python3dist-validators"

RDEPENDS:${PN} += "python-abi \
python311-decorator"

inherit rpm
