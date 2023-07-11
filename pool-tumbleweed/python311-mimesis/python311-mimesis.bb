SUMMARY = "Fake data generator"
DESCRIPTION = "Mimesis is a package for Python, which helps generate big volumes of \
fake data for a variety of purposes in a variety of languages. The \
fake data could be used to populate a testing database, create JSON \
and XML files, anonymize data taken from production and etc."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python311-mimesis-4.0.0-1.14.noarch.rpm"
RPM_HASH = "a48b1990582c35056e375ec84c613c4af32da7346677f047a43bf81fb89c270b28a9881ef9cbfae1dfe1eb312ce9efafc46bad648a16e924fa29aae84367d2ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mimesis \
python3.11dist-mimesis \
python311-mimesis \
python3dist-mimesis"

RDEPENDS:${PN} += "python-abi"

inherit rpm
