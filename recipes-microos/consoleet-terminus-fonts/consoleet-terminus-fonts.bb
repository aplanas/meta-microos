SUMMARY = "Vector/OTF versions of the Terminus bitmap fonts"
DESCRIPTION = "The Terminus bitmap fonts, provided in OpenType vector format. \
Both original (jagged-edge) and smooth-edge variants are provided."
LICENSE = "OFL-1.1"

PV = "4.49.1"

RPM_NAME = "consoleet-terminus-fonts-4.49.1-1.6.noarch.rpm"
RPM_HASH = "7df8e8689fbd3e468b30f6d8c85e25d9d31a0ea25f0edb9326c39e8983b39c7fbd3b1f424be902ddf1fb6c27597e2a349a800818b3048d77f762d37a50725dc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(consoleet-terminus-fonts) \
consoleet-terminus-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
