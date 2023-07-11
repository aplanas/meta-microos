SUMMARY = "Small program answering GTP ECHO Request with GTP ECHO Response"
DESCRIPTION = "Small program answering GTP ECHO Request with GTP ECHO Response for both GTPCv1 \
and GTPCv2."
LICENSE = "MIT"

PV = "1.10.1"

RPM_NAME = "gtp-echo-responder-1.10.1-1.2.aarch64.rpm"
RPM_HASH = "ace2a0b85f07c223f9879fcce79ab446f99944bf1e452a40103ea95b758784f1ba7e1c5a572c59ab1af68fc53fdd0efb497bcb32b758162e1e6d2aecbe562249"

RPROVIDES:${PN} += "gtp-echo-responder"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
