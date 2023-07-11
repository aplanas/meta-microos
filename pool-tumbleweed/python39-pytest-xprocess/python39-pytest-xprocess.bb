SUMMARY = "A pytest plugin for managing processes across test runs"
DESCRIPTION = "This will provide a xprocess fixture which can be used to ensure that \
external processes on which your application depends are up and running \
during testing. You can also use it to start and pre-configure \
test-specific databases (i.e. Postgres, Couchdb)."
LICENSE = "MIT"

PV = "0.22.2"

RPM_NAME = "python39-pytest-xprocess-0.22.2-1.3.noarch.rpm"
RPM_HASH = "0d23b898eeaeee80b2d47dc2f0b5c25ceb9fe105247fbf93052fe73dfd84e7677134c09f0d845068de3b66d2e4511742666015ed739a2164ed23cee7923d7664"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-xprocess \
python39-pytest-xprocess \
python3dist-pytest-xprocess"

RDEPENDS:${PN} += "python-abi \
python39-psutil \
python39-py \
python39-pytest"

inherit rpm
