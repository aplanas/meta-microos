SUMMARY = "Docker API Client"
DESCRIPTION = "Provides the functionality needed to operate the pseudo-tty (PTY) allocated to \
a docker container, using the Python client."
LICENSE = "Apache-2.0"

PV = "0.4.1"

RPM_NAME = "python310-dockerpty-0.4.1-5.5.noarch.rpm"
RPM_HASH = "3ee4c75ad5fdf3d2db85628bb5d4f1146f0233a847dafac2695b64fa42003949d92c2f2522d9424a14e5222fbaf903d1708e5155fd4093a83b1094fa48ad6251"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-dockerpty \
python310-dockerpty \
python3dist-dockerpty"

RDEPENDS:${PN} += "python-abi \
python310-docker \
python310-six"

inherit rpm
