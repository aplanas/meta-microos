SUMMARY = "Python library to control interactive applications"
DESCRIPTION = "Aexpect is a Python library used to control interactive applications, very \
similar to pexpect. It can be used to control applications such as ssh, scp \
sftp, telnet, among others."
LICENSE = "GPL-2.0-only"

PV = "1.6.4"

RPM_NAME = "python311-aexpect-1.6.4-2.5.noarch.rpm"
RPM_HASH = "3d8cbeed033fdafbf8f7be50c1f8dcc4e2322eccfd619d9a5c50d01e42c58603738cf6e2beb9284c7e3120944ce142df619e4521d0cbfab675ce7118bc5994da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aexpect \
python3.11dist-aexpect \
python311-aexpect \
python3dist-aexpect"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
