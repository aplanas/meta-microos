SUMMARY = "Tool for validating modulemd data"
DESCRIPTION = "The modulemd-validator tool provides the facility for verifying \
constructed modulemd data is correct and usable."
LICENSE = "MIT"

PV = "2.14.0"

RPM_NAME = "modulemd-validator-2.14.0-1.3.aarch64.rpm"
RPM_HASH = "43ac44a98ffad27b1fc3b6b25acbaf0de7209782cd01aac14c9443302a475cf1c06cd608276b8dca6eb97eb0387c17e9c85926828f37128c23726112841e4552"

RPROVIDES:${PN} += "modulemd-validator"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libmodulemd.so.2 \
libmodulemd2 \
libyaml-0.so.2"

inherit rpm
