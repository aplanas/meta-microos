SUMMARY = "Tool and library for manipulating LilyPond files"
DESCRIPTION = "Tool and library for manipulating LilyPond files"
LICENSE = "GPL-2.0-or-later"

PV = "0.9.8"

RPM_NAME = "python311-ly-0.9.8-1.1.noarch.rpm"
RPM_HASH = "aa71b194ff6fb12bb4fc7d51bf43c30f7c2555e83cb7cdc1b8a241e0cdfc474ca214a1a777eb28d1c9ed71996f109f871d78fe417c43d5e988498d6a18a8d74e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ly \
python3.11dist-python-ly \
python311-ly \
python3dist-python-ly"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
