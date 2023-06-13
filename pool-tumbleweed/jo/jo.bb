SUMMARY = "JSON output from a shell"
DESCRIPTION = "This is jo, a small utility to create JSON objects"
LICENSE = "GPL-2.0-or-later & MIT"

PV = "1.9"

RPM_NAME = "jo-1.9-1.2.aarch64.rpm"
RPM_HASH = "fbafad428b8d06464a47ac6e08f189af06420ea953ca46562b355a5b6281c4e59b28fd60d5a68f4eb75dea79f77e76f3eaec0fa02c037039a71d08fc61a7489d"

RPROVIDES:${PN} += "jo \
jo(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
