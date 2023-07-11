SUMMARY = "Test tools for the XTRX DSP library"
DESCRIPTION = "Test tools for the XTRX DSP library."
LICENSE = "LGPL-2.1-only"

PV = "0.0.0+git.20190830"

RPM_NAME = "xtrxdsp-tests-0.0.0+git.20190830-2.7.aarch64.rpm"
RPM_HASH = "d85c7c2c080a6077f79b69794f81ae60b1b55933b784fc4fb80681011ec3c5a2ea91e969779d1f8f39f8df240b51a8679b8007d2ea0b8c5dde307afc3f6f5084"

RPROVIDES:${PN} += "xtrxdsp-tests"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxtrxdsp.so.0"

inherit rpm
