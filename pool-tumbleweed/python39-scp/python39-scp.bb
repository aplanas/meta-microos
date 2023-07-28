SUMMARY = "SSH scp module for paramiko"
DESCRIPTION = "The scp.py module uses a paramiko transport to send and receive files via the \
scp protocol. This is the protocol as referenced from the openssh scp program, \
and has only been tested with this implementation."
LICENSE = "LGPL-2.1-or-later"

PV = "0.14.5"

RPM_NAME = "python39-scp-0.14.5-1.1.noarch.rpm"
RPM_HASH = "75719d83baeea7ea03464507c31f2aca897496df561fcda13d05ad950581eca3b68f2fbd5f19f47674c2ab983c8eb0021b9f4e475e744fa125beea83185b080b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-scp \
python39-scp \
python3dist-scp"

RDEPENDS:${PN} += "python-abi \
python39-paramiko"

inherit rpm
