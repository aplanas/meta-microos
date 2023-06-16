SUMMARY = "Pythonic Task Execution"
DESCRIPTION = "Invoke is a Python (2.7 and 3.4+) task execution tool & library, drawing \
inspiration from various sources to arrive at a powerful & clean feature set."
LICENSE = "BSD-2-Clause"

PV = "2.1.2"

RPM_NAME = "python311-invoke-2.1.2-1.1.noarch.rpm"
RPM_HASH = "7833afe3040ccc2235233c870e72cc5953bd2fe873c9270fd6b1babf9157096671b453004528820490fcc4d3d1785d73c760104d12f3532b493d7a1cf6c3feb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-invoke \
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
