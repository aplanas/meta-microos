SUMMARY = "SSH scp module for paramiko"
DESCRIPTION = "The scp.py module uses a paramiko transport to send and receive files via the \
scp protocol. This is the protocol as referenced from the openssh scp program, \
and has only been tested with this implementation."
LICENSE = "LGPL-2.1-or-later"

PV = "0.14.4"

RPM_NAME = "python39-scp-0.14.4-1.4.noarch.rpm"
RPM_HASH = "0933e59d1e1294e79e6e6af298b0c8fd5d60862431c704f81e9c08670eedd1eeeb95257dd645dfa66618c93ffda86804ebb25e7b836936245ac7151b92ca0f46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(scp) \
python39-scp \
python3dist(scp)"
RDEPENDS:${PN} += "python(abi) \
python39-paramiko"

inherit rpm
