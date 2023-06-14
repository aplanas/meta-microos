SUMMARY = "Punjabi (ਪੰਜਾਬੀ, پنجابی‎) Dictionary for Aspell"
DESCRIPTION = "A Punjabi (ਪੰਜਾਬੀ, پنجابی‎) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.01"

RPM_NAME = "aspell-pa-0.01-2.14.aarch64.rpm"
RPM_HASH = "7903c2a0500363bea9d9440ed5c4edd8137fd21f9354d6f1a997db6e6e38634a743a60dbf7b2e36801186e400285298814270173d054b58b3ba2a93788eb6a76"

RPROVIDES:${PN} += "aspell-pa \
locale-aspell-pa"

RDEPENDS:${PN} += ""

inherit rpm
