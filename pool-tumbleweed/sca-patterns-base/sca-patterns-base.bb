SUMMARY = "Supportconfig Analysis Pattern Base Libraries"
DESCRIPTION = "Supportconfig Analysis (SCA) appliance pattern base libraries used \
by all patterns"
LICENSE = "GPL-2.0-only"

PV = "1.5.2"

RPM_NAME = "sca-patterns-base-1.5.2-1.1.noarch.rpm"
RPM_HASH = "566a9c6b130d5e033bcd693d7dc335c7c09615e4eeaee0dcbaf0c1be12df8479318075e4e5c4c7d11e62855e3db44eb373aaa85c2dc7d31b6aa238635511929a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-SDP--Core \
perl-SDP--SUSE \
sca-patterns-base"

RDEPENDS:${PN} += "bash \
perl \
python3-base"

inherit rpm
