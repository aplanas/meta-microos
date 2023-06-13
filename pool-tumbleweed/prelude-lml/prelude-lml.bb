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

RPROVIDES:${PN} += "config(prelude-lml) \
prelude-lml \
prelude-lml(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libicui18n.so.73()(64bit) \
libicuuc.so.73()(64bit) \
libpcre.so.1()(64bit) \
libprelude.so.28()(64bit)"

inherit rpm
