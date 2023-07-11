SUMMARY = "Python library to parse Arch SRCINFO files"
DESCRIPTION = "Python library to parse Arch .SRCINFO files."
LICENSE = "ISC"

PV = "0.1.1"

RPM_NAME = "python310-srcinfo-0.1.1-1.6.noarch.rpm"
RPM_HASH = "56c54883a9b9eb2b6822f85586ade604c5afbfc150ed5ba7a5964efd987c6455b751c89a8723fbf205d2dd8e953b38836c1d082d5baaeaf057f8a130a5583b5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-srcinfo \
python310-srcinfo \
python3dist-srcinfo"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-parse \
update-alternatives"

inherit rpm
