SUMMARY = "The prelude log analyzer"
DESCRIPTION = "Prelude-LML is a log analyser that allows Prelude to collect and \
analyze information from all kind of applications emitting logs or \
syslog messages in order to detect suspicious activities and transform \
them into Prelude-IDMEF alerts. Prelude-LML handles events generated \
by a large set of applications"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only & GPL-3.0-or-later"

PV = "5.2.0"

RPM_NAME = "prelude-lml-5.2.0-2.9.aarch64.rpm"
RPM_HASH = "871fe4bb7d1923e91c6eb75f7b4637b1da52c63abd4af8c140f95b762c68b3857148f15eb31c81ea70c9b72005b52a43d0dd71fbd15c8a8f51e8f53244e9a811"

RPROVIDES:${PN} += "config-prelude-lml \
prelude-lml"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnutls.so.30 \
libicui18n.so.73 \
libicuuc.so.73 \
libpcre.so.1 \
libprelude.so.28"

inherit rpm
