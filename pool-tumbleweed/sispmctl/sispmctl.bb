SUMMARY = "SIS-PM Control for Linux"
DESCRIPTION = "This projects adds support control for the GEMBIRD Silver Shield PM device to linux."
LICENSE = "GPL-2.0-only"

PV = "4.11"

RPM_NAME = "sispmctl-4.11-1.1.aarch64.rpm"
RPM_HASH = "fc34c4fed5b4e757da7f38d936470ec35349b9694f024483089f5195ef5a6d81c9f0845e7afaab0a5aefb53bf02926d01167c72d600f1762256ae2bfac6d8d8f"

RPROVIDES:${PN} += "sispmctl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsispmctl.so.0 \
libusb-0.1.so.4"

inherit rpm
