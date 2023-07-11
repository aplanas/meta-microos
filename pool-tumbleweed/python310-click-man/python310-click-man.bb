SUMMARY = "Automate generation of man pages for python click applications"
DESCRIPTION = "Automate generation of man pages for Python Click applications."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python310-click-man-0.4.1-1.17.noarch.rpm"
RPM_HASH = "43ff18abda0b78e3b86bbb9969213075c0570986f20640a350b7a50e67236df1f5a36aa25cb2effeff82c9ec91cd081659f8ce44c0ac85bb53f6cd1552fd5ef6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-click-man \
python310-click-man \
python3dist-click-man"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-click"

inherit rpm
