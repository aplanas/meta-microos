SUMMARY = "OpenStack Packaging - python module name to package name map"
DESCRIPTION = "pymod2pkg is a simple python module for translating python module names to \
corresponding package names which is a common problem in the packaging world. \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "0.26.0"

RPM_NAME = "python3-pymod2pkg-0.26.0-1.11.noarch.rpm"
RPM_HASH = "a0f90c891a693f8a8c6380e897eec7b983d1956602d41eeb5feb3fe4bcc6aba5336daadbe9d17e1731bac1fcbf007ef6f0e32f3de0ba6ae85bac71d46b995e55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pymod2pkg \
python3.11dist-pymod2pkg \
python3dist-pymod2pkg"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-distro \
python3-pbr"

inherit rpm
