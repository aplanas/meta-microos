SUMMARY = "Tools for developing, debugging, and managing applications that use NSS"
DESCRIPTION = "The NSS Security Tools allow developers to test, debug, and manage \
applications that use NSS."
LICENSE = "MPL-2.0"

PV = "3.90"

RPM_NAME = "mozilla-nss-tools-3.90-1.1.aarch64.rpm"
RPM_HASH = "98d54ed06d7aa8135a3b333ee0f5286756dbd95c8c3d6728bd43842ac3064b85ceb5faa012cd3b4a48d0f37a3ee9ad61651af3be74e4b90eff9d9a8337cfcbad"

RPROVIDES:${PN} += "mozilla-nss-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnspr4.so \
libnss3.so \
libnssutil3.so \
libplc4.so \
libplds4.so \
libsmime3.so \
libssl3.so \
libz.so.1 \
mozilla-nss"

inherit rpm
