SUMMARY = "Aspect-oriented programming"
DESCRIPTION = "Aspectlib is an aspect-oriented programming, monkey-patch and \
decorators library. It is useful when changing behavior in \
existing code is desired. It includes tools for debugging and \
testing: simple mock/record and a complete capture/replay \
framework."
LICENSE = "BSD-2-Clause"

PV = "2.0.0"

RPM_NAME = "python311-aspectlib-2.0.0-1.3.noarch.rpm"
RPM_HASH = "f02a062a9a85d0702cb3a499482222255c09ba00661f4755bea7f12d82d241408b7dc72b0b4f7cf9660bbf065b2b870ef9fbf8a7e5257a0039dbb5e512959b12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aspectlib \
python3.11dist-aspectlib \
python311-aspectlib \
python3dist-aspectlib"

RDEPENDS:${PN} += "python-abi \
python311-fields"

inherit rpm
