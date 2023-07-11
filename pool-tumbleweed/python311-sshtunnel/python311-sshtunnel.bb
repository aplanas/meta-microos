SUMMARY = "SSH tunnels to remote server"
DESCRIPTION = "The sshtunnel package allows one to create SSH tunnels using local \
or remote port forwarding. Thus, it provides a Python wrapper to \
the same functionality provided by the SSH command using the -L \
and -R parameters."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python311-sshtunnel-0.4.0-2.8.noarch.rpm"
RPM_HASH = "df7a42ae788ceaefe28f54e702225b06bcb5266bed359e120fdcaab73a4aa2291f10a04107e77c5fbd50182c2ad748f973d41abe498af5266d13217d6e972f01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sshtunnel \
python3.11dist-sshtunnel \
python311-sshtunnel \
python3dist-sshtunnel"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
openssh \
python-abi \
python311-paramiko"

inherit rpm
