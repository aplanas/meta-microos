SUMMARY = "Python bindings for xrootd"
DESCRIPTION = "This package provides python3 bindings for xrootd."
LICENSE = "LGPL-3.0-or-later"

PV = "5.6.1"

RPM_NAME = "python311-xrootd-5.6.1-1.1.aarch64.rpm"
RPM_HASH = "a29300d9e4b7c0fff7aa368475d1dcb2a9988e2a28c04e1258596f42f15e990b84a474ef32282816a74c3afed5ec7737db11394fb7083668089f374e99a75204"

RPROVIDES:${PN} += "python3-xrootd \
python3.11dist-xrootd \
python311-xrootd \
python3dist-xrootd"

RDEPENDS:${PN} += "libXrdCl.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
