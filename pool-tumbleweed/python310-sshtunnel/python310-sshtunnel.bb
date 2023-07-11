SUMMARY = "SSH tunnels to remote server"
DESCRIPTION = "The sshtunnel package allows one to create SSH tunnels using local \
or remote port forwarding. Thus, it provides a Python wrapper to \
the same functionality provided by the SSH command using the -L \
and -R parameters."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python310-sshtunnel-0.4.0-2.8.noarch.rpm"
RPM_HASH = "9b1c5ba1a40eb853bc52704033a737220c467177566d50ce22b2f16d89023696160f68fc4942e4631da591112b5c2c998e98101a1a3615df2dfd1d5d226a05cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sshtunnel \
python310-sshtunnel \
python3dist-sshtunnel"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
openssh \
python-abi \
python310-paramiko"

inherit rpm
