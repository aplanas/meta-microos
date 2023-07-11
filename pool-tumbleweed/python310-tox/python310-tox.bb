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

RPM_NAME = "python310-tox-4.5.1-3.3.noarch.rpm"
RPM_HASH = "b62d34bd23d666e0952f6f50e5df9c0e71f3b250e0e1ea68d9937bdc8761d6934aa560d01499168cfe7da1a1aaca25a632f1698cb4ba50789bb4c44bf1f86c93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-tox \
python310-detox \
python310-tox \
python3dist-tox"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
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
