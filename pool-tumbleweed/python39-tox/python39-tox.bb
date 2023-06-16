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

RPM_NAME = "python39-tox-4.5.1-2.1.noarch.rpm"
RPM_HASH = "7261ea875606f2937a02a733c21f6d2153dc99688bf1222ad07eff08a5fa012e23be21bd980cc265c4c600badd94b3d691dc24c5bb741a69dcfd45086d0c2d0f"
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
