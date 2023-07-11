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

RPM_NAME = "python311-setuptools-git-1.2-4.2.noarch.rpm"
RPM_HASH = "d2d18892141ea2fa3f0061b3ba797b459ee776d1a9d2d9efefcc17bd3cb9194b39cbbc528b68a5862f287c49bf78ee5d175ce946e458f9c9b03209c3b526457d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-setuptools-git \
python3.11dist-setuptools-git \
python311-setuptools-git \
python3dist-setuptools-git"

RDEPENDS:${PN} += "python-abi"

inherit rpm
