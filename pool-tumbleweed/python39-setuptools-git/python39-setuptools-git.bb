SUMMARY = "Setuptools revision control system plugin for Git"
DESCRIPTION = "This is a plugin for setuptools that enables git integration. Once \
installed, Setuptools can be told to include in a package distribution \
all the files tracked by git. This is an alternative to explicit \
inclusion specifications with MANIFEST.in. \
 \
This package was formerly known as gitlsfiles. The name change is the \
result of an effort by the setuptools plugin developers to provide a \
uniform naming convention."
LICENSE = "BSD-3-Clause"

PV = "1.2"

RPM_NAME = "python39-setuptools-git-1.2-4.2.noarch.rpm"
RPM_HASH = "bb7475deeaf4f7a848121383286307122c96f47f95e1e6de6fcf0e257382f913f8b45460a0528fe1f517e97f8e73bab722eb9f41391b2357725fa61ee60e1ba8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-setuptools-git \
python39-setuptools-git \
python3dist-setuptools-git"

RDEPENDS:${PN} += "python-abi"

inherit rpm
