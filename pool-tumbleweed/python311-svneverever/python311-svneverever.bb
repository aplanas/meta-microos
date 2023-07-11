SUMMARY = "Tool collecting path entries across SVN history"
DESCRIPTION = "Tool collecting path entries across SVN history. It runs through all SVN history \
collecting additions of directories. In the end it presents a tree of all \
directories ever having existed in the repository."
LICENSE = "GPL-3.0-only"

PV = "1.7.1"

RPM_NAME = "python311-svneverever-1.7.1-1.5.noarch.rpm"
RPM_HASH = "5d173a4bde62f1f70d9854fab1e44f97a48e7404c740c16489113b6107f7fe790ac4b0d41f7057be226ce225cab6ddc4a2c3cb79acf0749d4438c341042d37bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-svneverever \
python3.11dist-svneverever \
python311-svneverever \
python3dist-svneverever"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
subversion \
update-alternatives"

inherit rpm
