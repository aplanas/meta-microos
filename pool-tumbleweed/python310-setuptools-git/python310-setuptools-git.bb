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

RPM_NAME = "python310-setuptools-git-1.2-4.1.noarch.rpm"
RPM_HASH = "04e4d71eec0e613ebed58553de8eca28d9f876214d1ffeb196d5781348da3fe638f762f11b2fd2a55ccb0c38093ec87517d4c9743a3f71b260dba10b94745989"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-setuptools-git \
python3.10dist(setuptools-git) \
python310-setuptools-git \
python3dist(setuptools-git)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
