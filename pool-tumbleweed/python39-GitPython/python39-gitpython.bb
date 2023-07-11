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

RPM_NAME = "python39-GitPython-3.1.31.1676565040.f253335-1.3.noarch.rpm"
RPM_HASH = "78c197f0204828404ad472bf3b96ce68bdc9fa286ad51c8c70715ce378ad72f0c22d1c795a49e9dff5573a8448992c20c668e6a194d54ba297973ad50d239d7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-gitpython \
python39-GitPython \
python3dist-gitpython"

RDEPENDS:${PN} += "git-core \
python-abi \
python39-gitdb"

inherit rpm
