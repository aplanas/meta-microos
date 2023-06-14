SUMMARY = "Tool collecting path entries across SVN history"
DESCRIPTION = "Tool collecting path entries across SVN history. It runs through all SVN history \
collecting additions of directories. In the end it presents a tree of all \
directories ever having existed in the repository."
LICENSE = "GPL-3.0-only"

PV = "1.7.1"

RPM_NAME = "python311-svneverever-1.7.1-1.4.noarch.rpm"
RPM_HASH = "dd2e18834a6497d8ec364d5bb74878e30f534e026f907791f032f21d675966cf9cb6a59b8521354fac2eabc6d6e7a89629fa7f4394bbed05c17f3a0c82422038"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-svneverever \
python311-svneverever \
python3dist-svneverever"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
subversion \
update-alternatives"

inherit rpm
