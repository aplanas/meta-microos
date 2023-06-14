SUMMARY = "Tool to analyze git deps"
DESCRIPTION = "Tool to analyze git dependencies \
 \
file bugs at https://github.com/aspiers/git-deps/issues"
LICENSE = "GPL-2.0-only"

PV = "1.0.2+git.1559732444.7c75531"

RPM_NAME = "git-deps-1.0.2+git.1559732444.7c75531-4.4.noarch.rpm"
RPM_HASH = "4c4dc9417f889de0680b4bf8fe30094d619acd204f4e6402bf1b078fe9bd53df68fb97a0a85cc55f1509de289741b95003f0571ebc61e8345c5042ed64d3161b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-deps \
python3.10dist-git-deps \
python3dist-git-deps"

RDEPENDS:${PN} += "/bin/bash \
/usr/bin/python3 \
npm \
python-abi \
python3-Flask \
python3-pygit2"

inherit rpm
