SUMMARY = "Template Text Parser"
DESCRIPTION = "TTP is a Python library for semi-structured text parsing using templates."
LICENSE = "MIT"

PV = "0.9.4"

RPM_NAME = "python39-ttp-0.9.4-1.3.noarch.rpm"
RPM_HASH = "e65ecc237a300466bba02c9b69a5a429172a26e9b4fb633da5e194a1649e6d66774b92aabfd819f433e4c394903a25eb43b2527abd69629bdd0c31e5df44b7d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ttp \
python39-ttp \
python3dist-ttp"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
