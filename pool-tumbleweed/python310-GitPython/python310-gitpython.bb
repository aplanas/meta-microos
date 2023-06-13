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

RPM_NAME = "python310-GitPython-3.1.31.1676565040.f253335-1.1.noarch.rpm"
RPM_HASH = "845b8279d7b3f651fb4fc9225a9e79a1d850f0405d61a100b35fad6f75d078524d8bce6e930f995bf01da4cc449b15ef36612d20a0e20194fc82834edf1a3dee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-GitPython \
python3.10dist(gitpython) \
python310-GitPython \
python3dist(gitpython)"

RDEPENDS:${PN} += "git-core \
python(abi) \
python310-gitdb"

inherit rpm
