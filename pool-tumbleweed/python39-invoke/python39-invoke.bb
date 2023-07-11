SUMMARY = "Pythonic Task Execution"
DESCRIPTION = "Invoke is a Python (2.7 and 3.4+) task execution tool & library, drawing \
inspiration from various sources to arrive at a powerful & clean feature set."
LICENSE = "BSD-2-Clause"

PV = "2.1.2"

RPM_NAME = "python39-invoke-2.1.2-1.3.noarch.rpm"
RPM_HASH = "a32da2ddb600c70ddf2f1038af5b4a562b83489ef9008133d3fa6218a6ef90d4dffad3e3cfaf527b1016771f3761540ec04adeebdda159cbb494c088849a12e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-invoke \
python39-invoke \
python3dist-invoke"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-PyYAML \
python39-fluidity-sm \
python39-lexicon \
update-alternatives"

inherit rpm
