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

RPM_NAME = "python310-setuptools-git-1.2-4.2.noarch.rpm"
RPM_HASH = "1a6b74394b37833e90766cd41a631964e8caa38d950814e1f6abb08db14afd62aef21175507e9fe6eeda7a5fd20a1ad815987262d61a265b15b4917fedff2e58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-setuptools-git \
python310-setuptools-git \
python3dist-setuptools-git"

RDEPENDS:${PN} += "python-abi"

inherit rpm
