SUMMARY = "SUSE Linux Base Package (recommended part)"
DESCRIPTION = "The parts of aaa_base that should be installed by default but are not \
strictly required to run a system. (bash completions and convenience hacks)."
LICENSE = "GPL-2.0-or-later"

PV = "84.87+git20230329.b39efbc"

RPM_NAME = "aaa_base-extras-84.87+git20230329.b39efbc-1.1.aarch64.rpm"
RPM_HASH = "7b012388267d52c6b0b9cd03d4c5a3ebc0a9d9d2923ea0cf38208c358583cc924ab22568546d9669d1e47be9e7149577a7d3067e10a95b17b651c5a258b215b5"

RPROVIDES:${PN} += "aaa-base-/etc/DIR-COLORS \
aaa-base-extras"

RDEPENDS:${PN} += "/usr/bin/find \
/usr/bin/sh \
aaa-base \
cpio \
fillup"

inherit rpm
