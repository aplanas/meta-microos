SUMMARY = "Virtualenv-based automation of test activities"
DESCRIPTION = "Tox as is a generic virtualenv management and test command line tool you can \
use for: \
 \
* checking your package installs correctly with different \
  Python versions and interpreters \
 \
* running your tests in each of the \
  environments, configuring your test tool of choice \
 \
* acting as a frontend to Continuous Integration \
  servers, greatly reducing boilerplate and merging \
  CI and shell-based testing."
LICENSE = "MIT"

PV = "4.5.1"

RPM_NAME = "python39-tox-4.5.1-3.3.noarch.rpm"
RPM_HASH = "08418458922bb2be4bd4fb437b1c8fe29bd70cf1f1fcb8cbde307d81c19f9bc090528fe53416fdc3888a7f2e6dc82d72180dccb3e389c6938516d7f7675ca4a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-tox \
python39-detox \
python39-tox \
python3dist-tox"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-cachetools \
python39-chardet \
python39-colorama \
python39-filelock \
python39-packaging \
python39-platformdirs \
python39-pluggy \
python39-pyproject-api \
python39-tomli \
python39-virtualenv \
update-alternatives"

inherit rpm
