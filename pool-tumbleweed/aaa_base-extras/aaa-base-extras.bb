SUMMARY = "SUSE Linux Base Package (recommended part)"
DESCRIPTION = "The parts of aaa_base that should be installed by default but are not \
strictly required to run a system. (bash completions and convenience hacks)."
LICENSE = "GPL-2.0-or-later"

PV = "84.87+git20230815.cab7b44"

RPM_NAME = "aaa_base-extras-84.87+git20230815.cab7b44-1.1.aarch64.rpm"
RPM_HASH = "80915dac2ef2b7eae5f996bd5b87f52545bdfda3334b14beff7ee33d3157728c14dd4b5b700a0cb5042751295c7d39ece31e510d4018fc6e8f7dfdef6a371012"

RPROVIDES:${PN} += "aaa-base-/etc/DIR-COLORS \
aaa-base-extras"

RDEPENDS:${PN} += "/usr/bin/find \
/usr/bin/sh \
aaa-base \
cpio \
fillup"

inherit rpm
