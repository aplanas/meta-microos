SUMMARY = "Automate generation of man pages for python click applications"
DESCRIPTION = "Automate generation of man pages for Python Click applications."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python311-click-man-0.4.1-1.15.noarch.rpm"
RPM_HASH = "b040a8e5d9ddd4785b940c29245a198794c3fa93e170e3d760cbcdd60e1ae4539e5ac590158c2cf9586d9c2ed52c2f820cb47917de0a0ea88d20e8e49c5ee415"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-click-man \
python311-click-man \
python3dist-click-man"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-click"

inherit rpm
