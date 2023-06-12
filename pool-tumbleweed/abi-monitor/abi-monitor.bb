SUMMARY = "A tool to monitor and build new versions of a software library"
DESCRIPTION = "Monitor new versions of a software library, try to build them \
and create profiles for abi-tracker"
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "1.12"

RPM_NAME = "abi-monitor-1.12-2.10.noarch.rpm"
RPM_HASH = "473a7f8d5db7eca2409f0b990abcc892b82e1765922227185ebca1fffe51ca4c0dd2c4e15e06c3a51d3e7584716858cfa58d4ffe23e251ba1e5489bd610a1d31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "abi-monitor"
RDEPENDS:${PN} += "/usr/bin/perl \
curl \
perl-base \
wget"

inherit rpm
