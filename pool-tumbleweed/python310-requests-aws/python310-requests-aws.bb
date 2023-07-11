SUMMARY = "AWS authentication for Amazon S3 for the python requests module"
DESCRIPTION = "AWS authentication for Amazon S3 for the Python 'requests' library. \
It is made to work with Python 2.7 and 3. \
At the moment, only S3 is supported."
LICENSE = "BSD-3-Clause"

PV = "0.1.8"

RPM_NAME = "python310-requests-aws-0.1.8-3.13.noarch.rpm"
RPM_HASH = "2ed194c7a57c28ef933de523877c5335566904c88b377c2c03cfa608298667519a9e6f120124c9e71c13442044e4d4b7c31a2b02c53fd2cbaa75ec839516dfc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-requests-aws \
python310-requests-aws \
python3dist-requests-aws"

RDEPENDS:${PN} += "python-abi \
python310-requests"

inherit rpm
