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

RPM_NAME = "python39-GitPython-3.1.31.1676565040.f253335-1.1.noarch.rpm"
RPM_HASH = "ffdb15853af62f5bcb057ef46286de925a85075408adb4d6dd3488ed4231b898744b34c7d2f3ab9a3931d63b298e9dc4440c4ff1d6f510a747300d8c6541dd78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-gitpython \
python39-GitPython \
python3dist-gitpython"

RDEPENDS:${PN} += "git-core \
python-abi \
python39-gitdb"

inherit rpm
