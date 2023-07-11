SUMMARY = "Executable tools from the IETF YANG data modeling parser toolkit"
DESCRIPTION = "This package provides the 'yanglint' and 'yangre' tools which can be used \
during the creation of IETF YANG schemas.  The tools are not generally \
useful for normal operation where libyang primarily processes configuration \
data, not schemas."
LICENSE = "BSD-3-Clause"

PV = "2.1.55"

RPM_NAME = "yang-tools-2.1.55-1.2.aarch64.rpm"
RPM_HASH = "a42ff8865e4cb90d93252b93480593be6c3ff69d99b26a77ee681fde9b8b11ba6af9b7b85eecaf2d3fbc95f86044d90a2d8f70f613f21f36f43e3b5612a5fdc8"

RPROVIDES:${PN} += "yang-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libyang.so.2"

inherit rpm
