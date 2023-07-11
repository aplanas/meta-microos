SUMMARY = "A top-like OCFS2 DLM lock monitor"
DESCRIPTION = "o2locktop is a top-like OCFS2 DLM lock monitor, it displays DLM lock \
usages via querying OCFS2 file system statistics from the specified \
nodes. \
 \
You can utilize o2locktop to detect the hot files/directories, whose \
DLM locks are frequently referenced among the cluster. \
 \
You can get the maximal wait time per DLM lock, this helps you \
identify which hot files/directories should be decoupled for \
improving file access performance."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.10+git.1564463799.6f331ba"

RPM_NAME = "o2locktop-1.0.10+git.1564463799.6f331ba-2.11.noarch.rpm"
RPM_HASH = "1bfdaebbd1dc1d6ac10ff9f6c3f254e912472ac1ddc4bd1c6f5b167d7cee7c323db865288f64f050bca67fe03ab4208834d5d6a359c849cd2f208b652ba7b6ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "o2locktop"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3"

inherit rpm
