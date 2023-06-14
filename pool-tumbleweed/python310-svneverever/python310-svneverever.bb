SUMMARY = "Tool collecting path entries across SVN history"
DESCRIPTION = "Tool collecting path entries across SVN history. It runs through all SVN history \
collecting additions of directories. In the end it presents a tree of all \
directories ever having existed in the repository."
LICENSE = "GPL-3.0-only"

PV = "1.7.1"

RPM_NAME = "python310-svneverever-1.7.1-1.4.noarch.rpm"
RPM_HASH = "25b5077bcbd6f13b5305457d57f0fc0fefc73ce2d53075b79a8a74212bfb5c3db712ae60bef75a79c9134b86946ba735d2dfbc465b8f0bd3009217cbd440709c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-svneverever \
python3.10dist-svneverever \
python310-svneverever \
python3dist-svneverever"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
subversion \
update-alternatives"

inherit rpm
