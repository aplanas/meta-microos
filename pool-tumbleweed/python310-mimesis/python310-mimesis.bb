SUMMARY = "Fake data generator"
DESCRIPTION = "Mimesis is a package for Python, which helps generate big volumes of \
fake data for a variety of purposes in a variety of languages. The \
fake data could be used to populate a testing database, create JSON \
and XML files, anonymize data taken from production and etc."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python310-mimesis-4.0.0-1.14.noarch.rpm"
RPM_HASH = "e07ce87996c37e1cb524038d724514a8ebce84cae3129aaad67f778841447fb641172e8e11436559e295f3c605b9e21ed37577aaa5efb1e02539448b192176d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-mimesis \
python310-mimesis \
python3dist-mimesis"

RDEPENDS:${PN} += "python-abi"

inherit rpm
