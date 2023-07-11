SUMMARY = "Authenticaton for container registry with tokens"
DESCRIPTION = "This package contains a tool to authenticate the access to \
a container registry. Access is granted defined by an access \
control list for every user."
LICENSE = "Apache-2.0"

PV = "1.9.0+git20211128.636c09a"

RPM_NAME = "docker_auth-1.9.0+git20211128.636c09a-1.11.aarch64.rpm"
RPM_HASH = "4db27da91d9a02315d7e4af0af2d55003a11d871644d327ec6f2b0c8f7244b1283da7098f181aef4a7d4d9ef9aae673d7562bbc191cb0bb14b3365e6efb22a85"

RPROVIDES:${PN} += "docker-auth"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
