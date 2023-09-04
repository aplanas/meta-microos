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

RPM_NAME = "python39-GitPython-3.1.32.1689011721.5d45ce2-1.1.noarch.rpm"
RPM_HASH = "6f1f995e48f09f62fcb8b553cc535fbd83bb1c67913b7650cfb716467bc69dabdd0abd01b2953c6bfc7a2436649a41fc0ed13b0176a7af972a3ecc5326fdecac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-gitpython \
python39-GitPython \
python3dist-gitpython"

RDEPENDS:${PN} += "git-core \
python-abi \
python39-gitdb"

inherit rpm
