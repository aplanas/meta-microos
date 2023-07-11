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

RPM_NAME = "python311-tox-4.5.1-3.3.noarch.rpm"
RPM_HASH = "1e242b4691cc079260f4757f888399f302e4be87282de41f30ba7486718a88a3d7fa6cddd3109cfe41d2d4ca7ff747b9e6ecd636c086119fb2ad616759b7ec0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-detox \
python3-tox \
python3.11dist-tox \
python311-detox \
python311-tox \
python3dist-tox \
tox"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-cachetools \
python311-chardet \
python311-colorama \
python311-filelock \
python311-packaging \
python311-platformdirs \
python311-pluggy \
python311-pyproject-api \
python311-tomli \
python311-virtualenv \
update-alternatives"

inherit rpm
