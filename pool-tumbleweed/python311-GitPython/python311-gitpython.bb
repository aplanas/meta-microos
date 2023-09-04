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

PV = "3.1.32.1689011721.5d45ce2"

RPM_NAME = "python311-GitPython-3.1.32.1689011721.5d45ce2-1.1.noarch.rpm"
RPM_HASH = "e9fedc1fdb2c1a52e466b9a8fe2189017991aa4908bf3bbeeffff89e2c43fe0753ca1d7098d761f40e88277c84c9923e2fade9b19bae8f5b87fc05e52d1cc0ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-GitPython \
python3.11dist-gitpython \
python311-GitPython \
python3dist-gitpython"

RDEPENDS:${PN} += "git-core \
python-abi \
python311-gitdb"

inherit rpm
