SUMMARY = "Tool to analyze git deps"
DESCRIPTION = "Tool to analyze git dependencies \
 \
file bugs at https://github.com/aspiers/git-deps/issues"
LICENSE = "GPL-2.0-only"

PV = "1.0.2+git.1559732444.7c75531"

RPM_NAME = "git-deps-1.0.2+git.1559732444.7c75531-4.5.noarch.rpm"
RPM_HASH = "47642af2b4eb27affb4edd114af391a591a7e0e476d01378620da80e6660048a257ea0763c280e17f85d9eb4d9ec76bcfa4e1050347c5277bf994d47728c2de8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-deps \
python3.11dist-git-deps \
python3dist-git-deps"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
npm \
python-abi \
python3-Flask \
python3-pygit2"

inherit rpm
