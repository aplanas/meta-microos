SUMMARY = "Small program answering GTP ECHO Request with GTP ECHO Response"
DESCRIPTION = "Small program answering GTP ECHO Request with GTP ECHO Response for both GTPCv1 \
and GTPCv2."
LICENSE = "MIT"

PV = "1.10.1"

RPM_NAME = "gtp-echo-responder-1.10.1-1.1.aarch64.rpm"
RPM_HASH = "51893decdbfdfced363ce5e35fa60601e0c19a74a5463f607d0e3f6bc7d23599fa7963ac034f8c2542766a8e299a5d41ec7df1a21b2fc0d4c376646eeef4879f"

RPROVIDES:${PN} += "gtp-echo-responder \
gtp-echo-responder(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
