SUMMARY = "Python library to control interactive applications"
DESCRIPTION = "Aexpect is a Python library used to control interactive applications, very \
similar to pexpect. It can be used to control applications such as ssh, scp \
sftp, telnet, among others."
LICENSE = "GPL-2.0-only"

PV = "1.6.4"

RPM_NAME = "python39-aexpect-1.6.4-2.5.noarch.rpm"
RPM_HASH = "916948013818cebc8d06a15c1abdc476a12a5e62cb65214e8a3c89c9374a3911593a157e4dd0fb2f3f5b689b92a667385c423cbee3f094ab044b52a74b27555e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-aexpect \
python39-aexpect \
python3dist-aexpect"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
