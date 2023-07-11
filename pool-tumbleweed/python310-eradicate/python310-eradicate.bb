SUMMARY = "Python utility for removing commented-out code"
DESCRIPTION = "With modern revision control available, there is no reason to save \
commented-out code to your repository. 'eradicate' helps cleans up \
existing junk comments. It does this by detecting block comments that \
contain valid Python syntax that are likely to be commented out code. \
(It avoids false positives like the sentence 'this is not good', \
which is valid Python syntax, but is probably not code.)"
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python310-eradicate-2.1.0-2.2.noarch.rpm"
RPM_HASH = "19f6a548919b482c129cb507f6d2f261e15ef9293bab597457dd6ac6404eb71798431564ed73558485b7dad4006eef7bccc8fc5caa1fe0380b00726940164931"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-eradicate \
python310-eradicate \
python3dist-eradicate"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
