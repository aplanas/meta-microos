SUMMARY = "HTTP destination support for syslog-ng"
DESCRIPTION = "This package provides HTTP destination support for syslog-ng by means \
of libcurl."
LICENSE = "GPL-2.0-only"

PV = "4.3.1"

RPM_NAME = "syslog-ng-curl-4.3.1-1.3.aarch64.rpm"
RPM_HASH = "9378c7514f9e662a95ba1c12a216ef6381ba97791886dc6927bfc9e5038b45935aaa19143e1d040dcbb2f4ec7447f178875bf1c460683377ea185ad5527b55fe"

RPROVIDES:${PN} += "syslog-ng-curl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libsyslog-ng-4.3.so.0 \
syslog-ng"

inherit rpm
