SUMMARY = "Amazon based arm64 systems"
DESCRIPTION = "Device Tree files for Amazon based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.4"

RPM_NAME = "dtb-amazon-6.3.4-1.1.aarch64.rpm"
RPM_HASH = "61722b06a691ad488834a968629bbcf3c6c694ce80a980efb96f110e5c764bfcababa6796db21197c6e8dbc928a0c51497da67734c52a57679ad993646b86208"

RPROVIDES:${PN} += "dtb-al \
dtb-amazon \
dtb-amazon(aarch-64) \
multiversion(dtb)"

RDEPENDS:${PN} += "/bin/sh \
coreutils"

inherit rpm
