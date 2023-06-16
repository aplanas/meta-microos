SUMMARY = "Python library to control interactive applications"
DESCRIPTION = "Aexpect is a Python library used to control interactive applications, very \
similar to pexpect. It can be used to control applications such as ssh, scp \
sftp, telnet, among others."
LICENSE = "GPL-2.0-only"

PV = "1.6.4"

RPM_NAME = "python310-aexpect-1.6.4-2.4.noarch.rpm"
RPM_HASH = "174d187a3e307d2a73781b0000a900184a8922e7ab7e00f1bc5004cb14481fb9b3378daa5fb2fc4a2d897e8f3b464ab1738363248ab69ab83144b277df38746e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aexpect \
python3.10dist-aexpect \
python310-aexpect \
python3dist-aexpect"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
