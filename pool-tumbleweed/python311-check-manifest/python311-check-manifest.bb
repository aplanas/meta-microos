SUMMARY = "Tool to check Python source package MANIFEST.in for completeness"
DESCRIPTION = "check-manifest is a tool for python developers to check for broken packages \
and missing files in MANIFEST."
LICENSE = "MIT"

PV = "0.49"

RPM_NAME = "python311-check-manifest-0.49-4.3.noarch.rpm"
RPM_HASH = "ffcb382ea77eea7c0dc7a410965884e017ccde106ef432641237a0885a99f040a64e94ae2356a45c0f12eaac1d5c46a33efc7ddc2e2498ba93dfabda5d5ae105"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-check-manifest \
python3.11dist-check-manifest \
python311-check-manifest \
python3dist-check-manifest"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-build \
python311-setuptools \
update-alternatives"

inherit rpm
