SUMMARY = "Sphinx objectsinv Inspection/Manipulation Tool"
DESCRIPTION = "Sphinx objects.inv Inspection/Manipulation Tool"
LICENSE = "MIT"

PV = "2.2.2"

RPM_NAME = "python39-sphobjinv-2.2.2-1.6.noarch.rpm"
RPM_HASH = "f93f04c60fb57a1aacaddc1de45e6653cd874a7c97629f4b8bca1f0dac226b84c48687f9821f47d411ce2e9369dae9521062270e924588651de9434164378703"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphobjinv \
python39-sphobjinv \
python3dist-sphobjinv"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-attrs \
python39-certifi \
python39-jsonschema \
update-alternatives"

inherit rpm
