SUMMARY = "Network Monitoring Tool"
DESCRIPTION = "Argus is a network monitoring tool. \
 \
Documentation can be found in /usr/share/doc/packages/argus."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only & MIT"

PV = "3.0.8.3"

RPM_NAME = "argus-3.0.8.3-3.3.aarch64.rpm"
RPM_HASH = "b75ad657cf616ed9a22d6effa0af02233de9904848ceb87b247ea9850991784bc1996f8b6a8215251fd11f90a6dc00357eff316a18c10dc3258b1b8ede9034fc"

RPROVIDES:${PN} += "argus \
argus(aarch-64)"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/perl"

inherit rpm
