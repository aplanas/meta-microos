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

RPM_NAME = "python310-GitPython-3.1.31.1676565040.f253335-1.3.noarch.rpm"
RPM_HASH = "2eb2557458caeb488bf23aa427decf7bada8db7656ad93c4aa96caee0988184c8c7f163c83080e9da8afe3629d8959bfadf74b0b98d098ef5fcedccee77033df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-gitpython \
python310-GitPython \
python3dist-gitpython"

RDEPENDS:${PN} += "git-core \
python-abi \
python310-gitdb"

inherit rpm
