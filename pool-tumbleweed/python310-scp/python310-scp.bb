SUMMARY = "SSH scp module for paramiko"
DESCRIPTION = "The scp.py module uses a paramiko transport to send and receive files via the \
scp protocol. This is the protocol as referenced from the openssh scp program, \
and has only been tested with this implementation."
LICENSE = "LGPL-2.1-or-later"

PV = "0.14.4"

RPM_NAME = "python310-scp-0.14.4-1.4.noarch.rpm"
RPM_HASH = "7dc0974e1e3fbe4eab0bef87069293aa02f3a2f60960ba127e1a93d5b73e40b73ad48b723bce39d2d251a0a31bf32dfaf8390c10ec538ef33b86635c04d4a986"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-scp \
python3.10dist(scp) \
python310-scp \
python3dist(scp)"

RDEPENDS:${PN} += "python(abi) \
python310-paramiko"

inherit rpm
