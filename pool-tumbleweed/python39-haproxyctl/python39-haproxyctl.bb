SUMMARY = "HAProxy control tool"
DESCRIPTION = "This is a utility to control HAProxy features through its admin \
socket. haproxyctl has the ability to disable/enable servers, fetch \
info from the running instance and list available servers, together \
with their status."
LICENSE = "GPL-3.0-only"

PV = "0.5"

RPM_NAME = "python39-haproxyctl-0.5-3.4.noarch.rpm"
RPM_HASH = "e9eb50c8b8417dfa0bb599bb39c496687bb7d6817dfb221f18cadb8f392806cc1be9b8a5a2d3a6add43831357eb8f3596338150797de8ed0c73c23ae457ae2f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-haproxyctl \
python39-haproxyctl \
python3dist-haproxyctl"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
haproxy \
python-abi"

inherit rpm
