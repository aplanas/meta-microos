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

RPM_NAME = "python310-GitPython-3.1.34.1693646983.2a2ae77-1.1.noarch.rpm"
RPM_HASH = "ffb25b49407aa2046bf7632c54403e8f119801f5bfcc16a831530d05976143cef341dae9ead451db54037803b69045048942ce6b177d31475d186214c816a949"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-gitpython \
python310-GitPython \
python3dist-gitpython"

RDEPENDS:${PN} += "git-core \
python-abi \
python310-gitdb"

inherit rpm
