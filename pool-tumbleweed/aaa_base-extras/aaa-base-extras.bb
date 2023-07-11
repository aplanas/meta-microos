SUMMARY = "SUSE Linux Base Package (recommended part)"
DESCRIPTION = "The parts of aaa_base that should be installed by default but are not \
strictly required to run a system. (bash completions and convenience hacks)."
LICENSE = "GPL-2.0-or-later"

PV = "84.87+git20230329.b39efbc"

RPM_NAME = "aaa_base-extras-84.87+git20230329.b39efbc-1.2.aarch64.rpm"
RPM_HASH = "d6b999fcc89eae9de3b2b7adc94718d8d5b16abf86c8af3fc113398c4e22d170df76a1d1cd18e0eb2f98f0e655608d2ad01cdd18bac39ede3c021f312a2f76b7"

RPROVIDES:${PN} += "aaa-base-/etc/DIR-COLORS \
aaa-base-extras"

RDEPENDS:${PN} += "/usr/bin/find \
/usr/bin/sh \
aaa-base \
cpio \
fillup"

inherit rpm
