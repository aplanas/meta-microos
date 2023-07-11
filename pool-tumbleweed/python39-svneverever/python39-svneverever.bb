SUMMARY = "Tool collecting path entries across SVN history"
DESCRIPTION = "Tool collecting path entries across SVN history. It runs through all SVN history \
collecting additions of directories. In the end it presents a tree of all \
directories ever having existed in the repository."
LICENSE = "GPL-3.0-only"

PV = "1.7.1"

RPM_NAME = "python39-svneverever-1.7.1-1.5.noarch.rpm"
RPM_HASH = "5a9026561aeb93da407b6055dcf4cc7f2279be2ede76c78fe4741e2ea7e0497f0f3441049137be8d81bb080d1d2001d9b31cee91fb29a2f6c2933b70e3b52fc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-svneverever \
python39-svneverever \
python3dist-svneverever"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
subversion \
update-alternatives"

inherit rpm
