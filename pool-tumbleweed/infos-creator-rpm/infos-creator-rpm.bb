SUMMARY = "Creates virt-builder index file part from kiwi job"
DESCRIPTION = "OBS kiwi_post_run hook to create virt-builder site index part out of a kiwi \
job."
LICENSE = "MIT"

PV = "0.3"

RPM_NAME = "infos-creator-rpm-0.3-2.10.noarch.rpm"
RPM_HASH = "e159d346cb7f940d38bf49c7d2731836e872ab796de7b80fc46c2bcd3b95d09e4c24e24e63477654d906fd5f28d2999f5e2e0cc9301c4f0fc3ebba833e4cb377"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "infos-creator-rpm \
kiwi-post-run"

RDEPENDS:${PN} += "/bin/sh \
qemu-tools \
xz"

inherit rpm
