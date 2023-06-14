SUMMARY = "Support library for utilities from the Schily toolbox"
DESCRIPTION = "libschily contains many OS abstraction functions used by the Schily \
tools."
LICENSE = "CDDL-1.0"

PV = "2022.10.16"

RPM_NAME = "libschily2_0-2022.10.16-47.3.aarch64.rpm"
RPM_HASH = "52cfdf58892b291601c6811bd2e0200247e2ee899329073eff738b6f0d75f86797ed08c67d5594cc5f8e8e6e4d223b9f7e71ec8c72996c014c4dd54644ff6532"

RPROVIDES:${PN} += "libschily.so.2.0 \
libschily2-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
