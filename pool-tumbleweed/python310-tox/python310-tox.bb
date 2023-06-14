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

RPM_NAME = "python310-tox-4.5.1-2.1.noarch.rpm"
RPM_HASH = "9d4cba699592590864e65f91c2b6ba4e375ead80b1920d208aadba90c7e0ac7d0f98ee75b09010c1343ace97e749c1b9df832c0dbd34eb6ecb43ed506f604fb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-detox \
python3-tox \
python3.10dist-tox \
python310-detox \
python310-tox \
python3dist-tox \
tox"

RDEPENDS:${PN} += "-python310-importlib-metadata >= 0.12 if python3-base < 3.8 \
/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-cachetools \
python310-chardet \
python310-colorama \
python310-filelock \
python310-packaging \
python310-platformdirs \
python310-pluggy \
python310-pyproject-api \
python310-tomli \
python310-virtualenv \
update-alternatives"

inherit rpm
