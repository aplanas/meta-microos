SUMMARY = "Controller for Yeelight smart devices"
DESCRIPTION = "Controller for Yeelight smart devices"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.13"

RPM_NAME = "perl-Device-Yeelight-0.13-1.10.noarch.rpm"
RPM_HASH = "97d3145ee95315fff1ba0cbc1ac3c8590e73c915b5f40385b18b03ef6c94ed2d473389b9aadbf8bc507b036cd6331cbfc35bc21c391021754a0f8bed8777534e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Device--Yeelight \
perl-Device--Yeelight--Light \
perl-Device-Yeelight"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-IO \
perl-IO--Socket--Multicast \
perl-JSON"

inherit rpm
