SUMMARY = "Python bindings for libraries for compizconfig-settings"
DESCRIPTION = "Python bindings for libraries/plugins for compizconfig-settings."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.18"

RPM_NAME = "python311-compizconfig-0.8.18-2.22.aarch64.rpm"
RPM_HASH = "803fcd5a19468830adf33dd8db8593ee17f3b6c95ea77675b44f29056a332a547e36128425337e41884bf6c8e7512d90e15a708e6e2bc9b6321b938ae81797cb"

RPROVIDES:${PN} += "python3-compizconfig \
python311-compizconfig"

RDEPENDS:${PN} += "compiz \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcompizconfig.so.0 \
python-abi"

inherit rpm
