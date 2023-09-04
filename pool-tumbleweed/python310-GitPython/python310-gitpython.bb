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

RPM_NAME = "python310-GitPython-3.1.32.1689011721.5d45ce2-1.1.noarch.rpm"
RPM_HASH = "80c261ef19b2386b291a461537aeb2ace86c429641c3f708f0ac3202a2714939980327a11829694f20f16d1e6ceb743db5d5bc00e6e9c20cab33fc67c3732865"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-gitpython \
python310-GitPython \
python3dist-gitpython"

RDEPENDS:${PN} += "git-core \
python-abi \
python310-gitdb"

inherit rpm
