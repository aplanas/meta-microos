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

RPM_NAME = "python311-setuptools-git-1.2-4.1.noarch.rpm"
RPM_HASH = "44f9ad51c546677e9304b456956362068362cef3f5002af183af8c0a67f319438b2c7450ec978b80a034f33d5d80059db31f8be6c6b97809089fc1af0ed5a04e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(setuptools-git) \
python311-setuptools-git \
python3dist(setuptools-git)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
