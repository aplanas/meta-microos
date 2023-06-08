SUMMARY = "Authenticaton for container registry with tokens"
DESCRIPTION = "This package contains a tool to authenticate the access to \
a container registry. Access is granted defined by an access \
control list for every user."
LICENSE = "Apache-2.0"

PV = "1.9.0+git20211128.636c09a"

RPM_NAME = "docker_auth-1.9.0+git20211128.636c09a-1.9.aarch64.rpm"
RPM_HASH = "93ff6fadfa5713c14985c679e876931f18cf8af3002b51ae3b7e7b018825c62a0449b1bdaf2bad5d1661e797348d66281669e0658eb491ed6753d7a73e2cda48"

RPROVIDES:${PN} += "docker_auth docker_auth(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
