SUMMARY = "XTRXDSP library"
DESCRIPTION = "DSP specific functions for SDR in general and XTRX in specific."
LICENSE = "LGPL-2.1-only"

PV = "0.0.0+git.20190830"

RPM_NAME = "libxtrxdsp0-0.0.0+git.20190830-2.7.aarch64.rpm"
RPM_HASH = "869ff0993dd6360a5750401978bbaaa510a84879fdce7e479001b04f1611e754143657c8635ebb539362bb7224d66a91f71267145440e2f671b2a25cd82a8623"

RPROVIDES:${PN} += "libxtrxdsp.so.0 \
libxtrxdsp0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
