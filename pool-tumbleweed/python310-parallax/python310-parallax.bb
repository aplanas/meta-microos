SUMMARY = "Python module for multi-node SSH command execution and file copy"
DESCRIPTION = "Parallax SSH provides an interface to executing commands on multiple \
nodes at once using SSH. It also provides commands for sending and receiving files to \
multiple nodes using SCP."
LICENSE = "BSD-3-Clause"

PV = "1.0.8"

RPM_NAME = "python310-parallax-1.0.8-2.3.noarch.rpm"
RPM_HASH = "1ffa487f96cf7a03bc8c8ff89175e8a21ab39ea5d7eef41acae8ac89c5ddac1cd12d69d7572d425226b3c0d2b3c50f73041c584488a6707ff551145e1673e73c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-parallax \
python310-parallax \
python3dist-parallax"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
openssh \
python-abi \
update-alternatives"

inherit rpm
