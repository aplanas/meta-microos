SUMMARY = "Python module for multi-node SSH command execution and file copy"
DESCRIPTION = "Parallax SSH provides an interface to executing commands on multiple \
nodes at once using SSH. It also provides commands for sending and receiving files to \
multiple nodes using SCP."
LICENSE = "BSD-3-Clause"

PV = "1.0.8"

RPM_NAME = "python311-parallax-1.0.8-2.2.noarch.rpm"
RPM_HASH = "a13f84ac743071981fd265d53d4a8732d58487bd4e4275f41ec4a34cded6f1c761c42ce3d6efc9ef0e4daa48bf3e4b8dcfc4eb577ca8b8a1e0468e68604048ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(parallax) \
python311-parallax \
python3dist(parallax)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
openssh \
python(abi) \
update-alternatives"

inherit rpm
