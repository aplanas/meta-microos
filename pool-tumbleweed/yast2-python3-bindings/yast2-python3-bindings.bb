SUMMARY = "Python3 bindings for the YaST platform"
DESCRIPTION = "The bindings allow YaST modules to be written using the Python language \
and also Python scripts can use YaST agents, APIs and modules."
LICENSE = "GPL-2.0-only"

PV = "4.6.0"

RPM_NAME = "yast2-python3-bindings-4.6.0-1.3.aarch64.rpm"
RPM_HASH = "e267ef0543f21c80ff02643a9b30edab3fc0289ee81b7ac0d240a732d38c76a665ad0a96cd77ca825b285315adf534acf44e54a31c87a55b79a7d1aad69ae82d"

RPROVIDES:${PN} += "libpy2lang-python3.so.0 \
yast2-python3-bindings"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpy2wfm.so.2 \
libpython3.10.so.1.0 \
libstdc++.so.6 \
liby2.so.4 \
liby2util.so.5 \
libycp.so.5 \
libycpvalues.so.6 \
python-abi \
python3 \
yast2-core \
yast2-ycp-ui-bindings"

inherit rpm
