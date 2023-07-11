SUMMARY = "Python module for multi-node SSH command execution and file copy"
DESCRIPTION = "Parallax SSH provides an interface to executing commands on multiple \
nodes at once using SSH. It also provides commands for sending and receiving files to \
multiple nodes using SCP."
LICENSE = "BSD-3-Clause"

PV = "1.0.8"

RPM_NAME = "python39-parallax-1.0.8-2.3.noarch.rpm"
RPM_HASH = "24dd75d3df1af7f7441ee61e0a8c25c7e66862b62863ee3cfd70a5251f0c743e45d19597b97799da51b97d8eac6a54802ce1fb06499febb875f2497852b4bb88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-parallax \
python39-parallax \
python3dist-parallax"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
openssh \
python-abi \
update-alternatives"

inherit rpm
