SUMMARY = "Executable tools from the IETF YANG data modeling parser toolkit"
DESCRIPTION = "This package provides the 'yanglint' and 'yangre' tools which can be used \
during the creation of IETF YANG schemas.  The tools are not generally \
useful for normal operation where libyang primarily processes configuration \
data, not schemas."
LICENSE = "BSD-3-Clause"

PV = "2.1.55"

RPM_NAME = "yang-tools-2.1.55-1.1.aarch64.rpm"
RPM_HASH = "1f915e700ea15e325727ace505337b6681ded381480185fae913b401a5f582662d4fd997dd20a2ce0669855e76958ca9afd979e2694a8db0ff776ddaa342d932"

RPROVIDES:${PN} += "yang-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libyang.so.2"

inherit rpm
