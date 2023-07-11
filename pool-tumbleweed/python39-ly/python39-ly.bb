SUMMARY = "Tool and library for manipulating LilyPond files"
DESCRIPTION = "Tool and library for manipulating LilyPond files"
LICENSE = "GPL-2.0-or-later"

PV = "0.9.8"

RPM_NAME = "python39-ly-0.9.8-1.1.noarch.rpm"
RPM_HASH = "a7a6a94e24b6935a72b55b91f4d1bef048c1d491a5f6474013e2b9bdc370d8cce8b99f2c91cb0420694d921c5cc042d8caabbc2d3c2638b5dd4aedbc70781637"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-ly \
python39-ly \
python3dist-python-ly"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
