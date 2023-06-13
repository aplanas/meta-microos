SUMMARY = "Directory Server (LDAP)"
DESCRIPTION = "The 32bit pattern complementing directory_server."
LICENSE = "MIT"

PV = "20210330"

RPM_NAME = "patterns-server-directory_server-32bit-20210330-5.1.aarch64.rpm"
RPM_HASH = "0b14eae5b8d8578b5e8842016864b89f77cf65605d8e09bed33c855e477c99586cf0deac0064e29051b8c9a68c238d1c9bd949c132c5502bf9d3577e3e4c6eeb"

RPROVIDES:${PN} += "pattern() \
patterns-server-directory_server-32bit \
patterns-server-directory_server-32bit(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
