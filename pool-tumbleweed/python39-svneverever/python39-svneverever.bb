SUMMARY = "Tool collecting path entries across SVN history"
DESCRIPTION = "Tool collecting path entries across SVN history. It runs through all SVN history \
collecting additions of directories. In the end it presents a tree of all \
directories ever having existed in the repository."
LICENSE = "GPL-3.0-only"

PV = "1.7.2"

RPM_NAME = "python39-svneverever-1.7.2-1.1.noarch.rpm"
RPM_HASH = "c1debe97837e3db1cdf887cc2ae17af23f3481865f71d41fb1a172f5a0f5071bf6741cc3c404179d08c424bebf3b9b628a18e221035eaefa41bb2ab8ce01343c"
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
