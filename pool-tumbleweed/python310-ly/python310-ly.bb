SUMMARY = "Tool and library for manipulating LilyPond files"
DESCRIPTION = "Tool and library for manipulating LilyPond files"
LICENSE = "GPL-2.0-or-later"

PV = "0.9.8"

RPM_NAME = "python310-ly-0.9.8-1.1.noarch.rpm"
RPM_HASH = "416e47c65413e69fc1a1705ee483c235a2724f950e897bdaa16edf36ddd75b8509aa3c407a071807c72debb48c4dc0a5f7e3f1a3fc3fc6ec3f9d49099b9ce4cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-ly \
python310-ly \
python3dist-python-ly"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
