SUMMARY = "Python utility for removing commented-out code"
DESCRIPTION = "With modern revision control available, there is no reason to save \
commented-out code to your repository. 'eradicate' helps cleans up \
existing junk comments. It does this by detecting block comments that \
contain valid Python syntax that are likely to be commented out code. \
(It avoids false positives like the sentence 'this is not good', \
which is valid Python syntax, but is probably not code.)"
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python311-eradicate-2.1.0-2.2.noarch.rpm"
RPM_HASH = "0f015b56bff1998b143580a8515d7747ae4a41a8e904be1e362e631b1993486948b4c75e3f43ecf4645602c307c83e7239bd1b483317e1de4dac32038451c880"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-eradicate \
python3.11dist-eradicate \
python311-eradicate \
python3dist-eradicate"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
