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

RPM_NAME = "python39-GitPython-3.1.34.1693646983.2a2ae77-1.1.noarch.rpm"
RPM_HASH = "1c75c1d08dee816311a2cdfce7005a8633452fe10e5040f1fbd2a80a35b8ea4990f62e586bc3d8780bb3fe8528fa06caa9a0388632665b4af2935639bdeb8363"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-gitpython \
python39-GitPython \
python3dist-gitpython"

RDEPENDS:${PN} += "git-core \
python-abi \
python39-gitdb"

inherit rpm
