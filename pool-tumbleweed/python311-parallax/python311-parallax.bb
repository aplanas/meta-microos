SUMMARY = "Python module for multi-node SSH command execution and file copy"
DESCRIPTION = "Parallax SSH provides an interface to executing commands on multiple \
nodes at once using SSH. It also provides commands for sending and receiving files to \
multiple nodes using SCP."
LICENSE = "BSD-3-Clause"

PV = "1.0.8"

RPM_NAME = "python311-parallax-1.0.8-2.3.noarch.rpm"
RPM_HASH = "738134b284dc606ead524daec456930badc4f0bc3f6c971189bcd33cfa0e81810378e625cb4cec2e89055a6207427ae59545e69730346b0a275dfa39ca0f871e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-parallax \
python3.11dist-parallax \
python311-parallax \
python3dist-parallax"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
openssh \
python-abi \
update-alternatives"

inherit rpm
