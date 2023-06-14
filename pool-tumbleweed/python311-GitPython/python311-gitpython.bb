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

PV = "3.1.31.1676565040.f253335"

RPM_NAME = "python311-GitPython-3.1.31.1676565040.f253335-1.1.noarch.rpm"
RPM_HASH = "be47ade361e11da01323e67efc9dbbe1cd9ed533bd5bf8cbae559d96aa9c96de080fad83c6cc4904aacc9b9fb880e4b7f49db06f3ccaefbcaa1c476b9e98bdcf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-gitpython \
python311-GitPython \
python3dist-gitpython"

RDEPENDS:${PN} += "git-core \
python-abi \
python311-gitdb"

inherit rpm
