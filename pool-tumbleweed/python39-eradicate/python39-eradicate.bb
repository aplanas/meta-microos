SUMMARY = "Python utility for removing commented-out code"
DESCRIPTION = "With modern revision control available, there is no reason to save \
commented-out code to your repository. 'eradicate' helps cleans up \
existing junk comments. It does this by detecting block comments that \
contain valid Python syntax that are likely to be commented out code. \
(It avoids false positives like the sentence 'this is not good', \
which is valid Python syntax, but is probably not code.)"
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python39-eradicate-2.1.0-2.2.noarch.rpm"
RPM_HASH = "8ff3d1e2f607b6b520d22713b786633044bcf482364a20c2a233e7d34830ad4cebd8913af1c43e85b2a76483200fcf8181d91cec50a3f21e53ffea5be3e353f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-eradicate \
python39-eradicate \
python3dist-eradicate"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
