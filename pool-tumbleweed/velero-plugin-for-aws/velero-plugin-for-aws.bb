SUMMARY = "Velero plugin for AWS"
DESCRIPTION = "Plugins to support Velero on Amazon Web Service (AWS)"
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "velero-plugin-for-aws-1.4.0-1.7.aarch64.rpm"
RPM_HASH = "7bdbbe446dc7b77175a98450861270f8bc37e5331391092b8c5c645121e772b97f84e10370086e6922d039b243aea8187310a9c456718a13692d8a8efaf03f2b"

RPROVIDES:${PN} += "velero-plugin-for-aws \
velero-plugin-for-aws(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
