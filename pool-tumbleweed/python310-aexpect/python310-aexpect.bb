SUMMARY = "Python library to control interactive applications"
DESCRIPTION = "Aexpect is a Python library used to control interactive applications, very \
similar to pexpect. It can be used to control applications such as ssh, scp \
sftp, telnet, among others."
LICENSE = "GPL-2.0-only"

PV = "1.6.4"

RPM_NAME = "python310-aexpect-1.6.4-2.5.noarch.rpm"
RPM_HASH = "d25e4263c8f7949b8ee518fdc2f5093aeb3b3cd5a864825c24a15bfeb3a48350d7f3f8a4c1479cbdcbb4642aa7eb48976f73095aef13f9484941b39a5cc892b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-aexpect \
python310-aexpect \
python3dist-aexpect"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
