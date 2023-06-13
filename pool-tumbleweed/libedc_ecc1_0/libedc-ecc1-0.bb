SUMMARY = "Reed-Solomon encoder for Compact Discs"
DESCRIPTION = "The library implements a Reed-Solomon encoder for Compact \
Discs to generate Error Correcting Codes (ECC)."
LICENSE = "CDDL-1.0"

PV = "3.02~a10"

RPM_NAME = "libedc_ecc1_0-3.02~a10-47.3.aarch64.rpm"
RPM_HASH = "cfe71a1a8a7fe59ac909e772951608c42361ed77732e30ec8cabc6a8fae1f6e8df4f6763263f245d4924c112d358a4e5348233b5c59f94376db2456c15668820"

RPROVIDES:${PN} += "libedc_ecc.so.1.0()(64bit) \
libedc_ecc1_0 \
libedc_ecc1_0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6()(64bit)"

inherit rpm
