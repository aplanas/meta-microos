SUMMARY = "Pythonic Task Execution"
DESCRIPTION = "Invoke is a Python (2.7 and 3.4+) task execution tool & library, drawing \
inspiration from various sources to arrive at a powerful & clean feature set."
LICENSE = "BSD-2-Clause"

PV = "2.1.2"

RPM_NAME = "python311-invoke-2.1.2-1.3.noarch.rpm"
RPM_HASH = "36079ac8dafdac4f75ccd7bd83d0498e8a7f1b47272ff38acf90d4fc10cccd8b47cc56404c1df137fc93695bfcdd2c2f76c058ff34330875e835336f2ec33788"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-invoke \
python3.11dist-invoke \
python311-invoke \
python3dist-invoke"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-PyYAML \
python311-fluidity-sm \
python311-lexicon \
update-alternatives"

inherit rpm
