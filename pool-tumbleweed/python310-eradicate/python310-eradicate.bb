SUMMARY = "Python utility for removing commented-out code"
DESCRIPTION = "With modern revision control available, there is no reason to save \
commented-out code to your repository. 'eradicate' helps cleans up \
existing junk comments. It does this by detecting block comments that \
contain valid Python syntax that are likely to be commented out code. \
(It avoids false positives like the sentence 'this is not good', \
which is valid Python syntax, but is probably not code.)"
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python310-eradicate-2.1.0-1.4.noarch.rpm"
RPM_HASH = "2d811b921eaa3680c4a175f17015f66ec6d1cfad786464749ad62814c763897298301c696f6d661b78fa496c603ec7c6c0800509bde9e39cce307b5d066377d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-eradicate \
python3.10dist(eradicate) \
python310-eradicate \
python3dist(eradicate)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
update-alternatives"

inherit rpm
