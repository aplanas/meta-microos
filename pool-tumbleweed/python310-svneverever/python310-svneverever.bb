SUMMARY = "Tool collecting path entries across SVN history"
DESCRIPTION = "Tool collecting path entries across SVN history. It runs through all SVN history \
collecting additions of directories. In the end it presents a tree of all \
directories ever having existed in the repository."
LICENSE = "GPL-3.0-only"

PV = "1.7.1"

RPM_NAME = "python310-svneverever-1.7.1-1.5.noarch.rpm"
RPM_HASH = "e3ac55f141598f5fb92d64d2493c3525d6401fff0445d1dc11cfb942cee174f1b599cf17adf1b42ffc212bda428790589967305fe73cdca16815e5cbc8ca181f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-svneverever \
python310-svneverever \
python3dist-svneverever"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
subversion \
update-alternatives"

inherit rpm
