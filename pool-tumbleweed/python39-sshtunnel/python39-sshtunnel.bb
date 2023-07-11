SUMMARY = "SSH tunnels to remote server"
DESCRIPTION = "The sshtunnel package allows one to create SSH tunnels using local \
or remote port forwarding. Thus, it provides a Python wrapper to \
the same functionality provided by the SSH command using the -L \
and -R parameters."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python39-sshtunnel-0.4.0-2.8.noarch.rpm"
RPM_HASH = "31dd67a3cb15d9aaa8f57bcb3728cf18bc4b9b44ec76f9334604bda5572abab99c651e92e266da2464aacdac192befedae8505949fdc3f4556d7dd107f4eba49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sshtunnel \
python39-sshtunnel \
python3dist-sshtunnel"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
openssh \
python-abi \
python39-paramiko"

inherit rpm
