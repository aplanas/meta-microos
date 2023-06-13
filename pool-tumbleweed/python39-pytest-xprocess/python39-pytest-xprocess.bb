SUMMARY = "A pytest plugin for managing processes across test runs"
DESCRIPTION = "This will provide a xprocess fixture which can be used to ensure that \
external processes on which your application depends are up and running \
during testing. You can also use it to start and pre-configure \
test-specific databases (i.e. Postgres, Couchdb)."
LICENSE = "MIT"

PV = "0.22.2"

RPM_NAME = "python39-pytest-xprocess-0.22.2-1.1.noarch.rpm"
RPM_HASH = "336e4077f2e8a2b6a9c99262883849c68c1a53a54cd0756d5164e1d46e1ba27cbebcbda7d17113422b0bc5dc94f00d2c5c22cebc57c2169685026a9c75b51734"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-xprocess) \
python39-pytest-xprocess \
python3dist(pytest-xprocess)"

RDEPENDS:${PN} += "python(abi) \
python39-psutil \
python39-py \
python39-pytest"

inherit rpm
