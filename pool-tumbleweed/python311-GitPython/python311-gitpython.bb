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

RPM_NAME = "python311-GitPython-3.1.31.1676565040.f253335-1.3.noarch.rpm"
RPM_HASH = "c636d039b73c53d1473cb344aa61aee67c81eaa29a0e42cab46dce9ceb5e960bde80bb478697d68addd94c56469a963f55cafb280e539608990d7b9b6dc379a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-GitPython \
python3.11dist-gitpython \
python311-GitPython \
python3dist-gitpython"

RDEPENDS:${PN} += "git-core \
python-abi \
python311-gitdb"

inherit rpm
