SUMMARY = "Authenticaton for container registry with tokens"
DESCRIPTION = "This package contains a tool to authenticate the access to \
a container registry. Access is granted defined by an access \
control list for every user."
LICENSE = "Apache-2.0"

PV = "1.9.0+git20211128.636c09a"

RPM_NAME = "docker_auth-1.9.0+git20211128.636c09a-1.10.aarch64.rpm"
RPM_HASH = "0997c152eccfff5bd55f5cd7d803bdbe03678829943096e5401ef5fd79be015ce5110623fe1a5363613d3d81c0522980292ef4c50bad6e6e74b80c19a4e79965"

RPROVIDES:${PN} += "docker_auth \
docker_auth(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
