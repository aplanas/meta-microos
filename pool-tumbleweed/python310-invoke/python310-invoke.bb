SUMMARY = "Pythonic Task Execution"
DESCRIPTION = "Invoke is a Python (2.7 and 3.4+) task execution tool & library, drawing \
inspiration from various sources to arrive at a powerful & clean feature set."
LICENSE = "BSD-2-Clause"

PV = "2.1.2"

RPM_NAME = "python310-invoke-2.1.2-1.1.noarch.rpm"
RPM_HASH = "c9599528fa4e63a9fbbc1618e63814935ab0c134eea57d51882152ceedaed0dc5c7368ba78e1d27b5c1735d58c1da4a1969b70eba30670ec39841b3f0d4a5f5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-invoke \
python3.10dist-invoke \
python310-invoke \
python3dist-invoke"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-PyYAML \
python310-fluidity-sm \
python310-lexicon \
update-alternatives"

inherit rpm
