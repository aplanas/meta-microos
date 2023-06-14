SUMMARY = "A pytest plugin for managing processes across test runs"
DESCRIPTION = "This will provide a xprocess fixture which can be used to ensure that \
external processes on which your application depends are up and running \
during testing. You can also use it to start and pre-configure \
test-specific databases (i.e. Postgres, Couchdb)."
LICENSE = "MIT"

PV = "0.22.2"

RPM_NAME = "python311-pytest-xprocess-0.22.2-1.1.noarch.rpm"
RPM_HASH = "70ea7070dd105c962bfd7de854f63242a132d7cd6873cc4c1bed1fdc959a4845b1dcccc87022792ea0a35edcb9d82eaa58020ab848a4be9a7d495bddd077f8d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pytest-xprocess \
python311-pytest-xprocess \
python3dist-pytest-xprocess"

RDEPENDS:${PN} += "python-abi \
python311-psutil \
python311-py \
python311-pytest"

inherit rpm
