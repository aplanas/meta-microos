SUMMARY = "Userspace configuration files for rt2860 driver"
DESCRIPTION = "This package contains a small configuration file of the rt2860 driver, \
currently read by the kernel module. In later versions this will go \
away. \
 \
 \
 \
Authors: \
-------- \
    Ralink Tech Inc."
LICENSE = "GPL-2.0+"

PV = "1.8.0.0"

RPM_NAME = "rt2860-1.8.0.0-23.16.noarch.rpm"
RPM_HASH = "b42bf450b6ea42f7b5edd2ec15b0dbb7a505ccafbfbc6acec45d7557cf7ba21b92dd90d47b0241caa925e1c2d741ba86f37ae22243275c3c76ff254a162bc46b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(rt2860) \
rt2860"
RDEPENDS:${PN} += ""

inherit rpm
