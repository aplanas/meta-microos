SUMMARY = "Tool collecting path entries across SVN history"
DESCRIPTION = "Tool collecting path entries across SVN history. It runs through all SVN history \
collecting additions of directories. In the end it presents a tree of all \
directories ever having existed in the repository."
LICENSE = "GPL-3.0-only"

PV = "1.7.2"

RPM_NAME = "python310-svneverever-1.7.2-1.1.noarch.rpm"
RPM_HASH = "4a87ad7982e08a7b460dcb6e11206e140db77716311a6bd056ad298a991e27a3039b033967d1ab031e2c77ec3a12e9a19fece7dcfec4ef22734bda89f291cd3f"
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
