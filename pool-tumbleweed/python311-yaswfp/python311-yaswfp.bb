SUMMARY = "Yet Another SWF Parser"
DESCRIPTION = "Yet Another SWF Parser."
LICENSE = "GPL-3.0"

PV = "0+git.1411687316.2a2cc6c"

RPM_NAME = "python311-yaswfp-0+git.1411687316.2a2cc6c-1.11.noarch.rpm"
RPM_HASH = "25a56a6290812b59a603d122918e7ed4ef68a4eec9ddf831606a86edc6f84c69bf3e2dc748cfd229c8764aab62ae0ef2ed55a81f7e8bce987b402febe86637a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-yaswfp \
python3.11dist-yaswfp \
python311-yaswfp \
python3dist-yaswfp"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi"

inherit rpm
