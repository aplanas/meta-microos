SUMMARY = "Quickly rewrite git repository history (git-filter-branch replacement)"
DESCRIPTION = "git filter-repo is a versatile tool for rewriting history, which includes \
capabilities not found anywhere else. It roughly falls into the same space of \
tool as git filter-branch but without the capitulation-inducing poor \
performance, with far more capabilities, and with a design that scales \
usability-wise beyond trivial rewriting cases."
LICENSE = "GPL-2.0-only | MIT"

PV = "2.38.0"

RPM_NAME = "git-filter-repo-2.38.0-1.3.noarch.rpm"
RPM_HASH = "b190c4755f15f4b4be7f5dc648c1a186b606b19b8f184c15a4e4eaebb0051b96170204106a53291fcf2d4c3a56d2cdcc0e97c3bfed31218214fac4524b03e513"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-filter-repo"

RDEPENDS:${PN} += "/usr/bin/python3 \
git-core \
python-abi"

inherit rpm
