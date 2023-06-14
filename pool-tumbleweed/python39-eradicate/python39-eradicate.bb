SUMMARY = "Python utility for removing commented-out code"
DESCRIPTION = "With modern revision control available, there is no reason to save \
commented-out code to your repository. 'eradicate' helps cleans up \
existing junk comments. It does this by detecting block comments that \
contain valid Python syntax that are likely to be commented out code. \
(It avoids false positives like the sentence 'this is not good', \
which is valid Python syntax, but is probably not code.)"
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python39-eradicate-2.1.0-1.4.noarch.rpm"
RPM_HASH = "54527febfe9c6b81902e1eee5b69978f5a43bedc6b3b140862278f3638dafae229af02c2474ab608738a034168b49f7700f29cba6b059caba7723a569e455a6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-eradicate \
python39-eradicate \
python3dist-eradicate"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
update-alternatives"

inherit rpm
