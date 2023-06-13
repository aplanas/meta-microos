SUMMARY = "UsrMerge tools"
DESCRIPTION = "Tools related to UsrMerge to check the state of the system and to \
convert an existing system to UsrMerge."
LICENSE = "MIT"

PV = "84.87"

RPM_NAME = "compat-usrmerge-tools-84.87-5.14.aarch64.rpm"
RPM_HASH = "6a1a325228ba8fcb5d54ddb7739f519d521de2b7e0e26ea8250dba2babdc0060617528994dbded2f159e9a93941489dc2e3f6770ad526c4aff58cfd72849ba48"

RPROVIDES:${PN} += "compat-usrmerge-tools \
compat-usrmerge-tools(aarch-64)"

RDEPENDS:${PN} += "(compat-usrmerge if compat-usrmerge)"

inherit rpm
