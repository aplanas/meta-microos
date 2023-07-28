SUMMARY = "Tool collecting path entries across SVN history"
DESCRIPTION = "Tool collecting path entries across SVN history. It runs through all SVN history \
collecting additions of directories. In the end it presents a tree of all \
directories ever having existed in the repository."
LICENSE = "GPL-3.0-only"

PV = "1.7.2"

RPM_NAME = "python311-svneverever-1.7.2-1.1.noarch.rpm"
RPM_HASH = "df52e8861537658ec458269e22ded699c47622946149ce73205f9ea22d44098c876ca63155fd4defae2791bd20073266bd61b1dc475695bdaad901bdf54f1d7e"
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
