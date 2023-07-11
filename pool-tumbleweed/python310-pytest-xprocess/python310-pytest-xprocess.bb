SUMMARY = "A pytest plugin for managing processes across test runs"
DESCRIPTION = "This will provide a xprocess fixture which can be used to ensure that \
external processes on which your application depends are up and running \
during testing. You can also use it to start and pre-configure \
test-specific databases (i.e. Postgres, Couchdb)."
LICENSE = "MIT"

PV = "0.22.2"

RPM_NAME = "python310-pytest-xprocess-0.22.2-1.3.noarch.rpm"
RPM_HASH = "08030461ecf2deb085108933c93d4a08eba97a37cc79c09f8d317940f312ee603d57c08042427d61c73780f864cfb40e27d33172156d78e2e986cbe0a5e2bb53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-xprocess \
python310-pytest-xprocess \
python3dist-pytest-xprocess"

RDEPENDS:${PN} += "python-abi \
python310-psutil \
python310-py \
python310-pytest"

inherit rpm
