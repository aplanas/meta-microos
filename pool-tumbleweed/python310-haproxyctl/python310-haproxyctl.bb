SUMMARY = "HAProxy control tool"
DESCRIPTION = "This is a utility to control HAProxy features through its admin \
socket. haproxyctl has the ability to disable/enable servers, fetch \
info from the running instance and list available servers, together \
with their status."
LICENSE = "GPL-3.0-only"

PV = "0.5"

RPM_NAME = "python310-haproxyctl-0.5-3.5.noarch.rpm"
RPM_HASH = "1f258834241ca7028c5028f7403fd70697c3bb61b0dc736f15975e178a0a250a8562911cd0aad52ae272c3bbe21d2aa0e16b2ec8e4357d9ec32cfeb10a78e6ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-haproxyctl \
python310-haproxyctl \
python3dist-haproxyctl"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
haproxy \
python-abi"

inherit rpm
