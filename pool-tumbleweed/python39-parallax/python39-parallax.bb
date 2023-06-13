SUMMARY = "Python module for multi-node SSH command execution and file copy"
DESCRIPTION = "Parallax SSH provides an interface to executing commands on multiple \
nodes at once using SSH. It also provides commands for sending and receiving files to \
multiple nodes using SCP."
LICENSE = "BSD-3-Clause"

PV = "1.0.8"

RPM_NAME = "python39-parallax-1.0.8-2.2.noarch.rpm"
RPM_HASH = "aa0e013052d215790b2867080297214208763ea147d2657f611718ea3952df1d49ebb5dd202e5b41fcc7f1420305a6aba9d454aa541dc2d302dfbea7af7077d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(parallax) \
python39-parallax \
python3dist(parallax)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
openssh \
python(abi) \
update-alternatives"

inherit rpm
