SUMMARY = "Python Git Library"
DESCRIPTION = "GitPython is a python library used to interact with Git repositories. \
 \
GitPython provides object model read and write access to your git repository. \
Access repository information conveniently, alter the index directly, handle \
remotes, or go down to low-level object database access with big-files support. \
 \
With the new object database abstraction added in 0.3, its even possible to \
implement your own storage mechanisms, the currently available implementations \
are 'cgit' and pure python, which is the default."
LICENSE = "BSD-3-Clause"

PV = "3.1.34.1693646983.2a2ae77"

RPM_NAME = "python311-GitPython-3.1.34.1693646983.2a2ae77-1.1.noarch.rpm"
RPM_HASH = "e9fd56582f38438c7a131892e0f2ca3d7ef55c8380cd5cc4235891f73777fecde71d32c1cdbcf6b236a2f2ee0c032797a099323814f072732d7fc80dca5c5bc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-GitPython \
python3.11dist-gitpython \
python311-GitPython \
python3dist-gitpython"

RDEPENDS:${PN} += "git-core \
python-abi \
python311-gitdb"

inherit rpm
