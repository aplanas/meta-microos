SUMMARY = "Fake data generator"
DESCRIPTION = "Mimesis is a package for Python, which helps generate big volumes of \
fake data for a variety of purposes in a variety of languages. The \
fake data could be used to populate a testing database, create JSON \
and XML files, anonymize data taken from production and etc."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python39-mimesis-4.0.0-1.14.noarch.rpm"
RPM_HASH = "2dfdfa9e6337fb61ba70e427dcb3fed6fc7a3365522859338f2caf4aef7a6cf1d2f6e1498dda1c6976c5c5a3685a82b9fdc72e7713639c103a25fde70042a184"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-mimesis \
python39-mimesis \
python3dist-mimesis"

RDEPENDS:${PN} += "python-abi"

inherit rpm
