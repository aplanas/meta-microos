SUMMARY = "Fake data generator"
DESCRIPTION = "Mimesis is a package for Python, which helps generate big volumes of \
fake data for a variety of purposes in a variety of languages. The \
fake data could be used to populate a testing database, create JSON \
and XML files, anonymize data taken from production and etc."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python310-mimesis-4.0.0-1.12.noarch.rpm"
RPM_HASH = "50398c05372fddfae47380d11a84b4a17ee94b37e5f7588d8b6c0ba79155e4c16369a90d27147ea8641e4e1aeac00ce29708565551c328106b52a92fcb154551"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mimesis \
python3.10dist-mimesis \
python310-mimesis \
python3dist-mimesis"

RDEPENDS:${PN} += "python-abi"

inherit rpm
