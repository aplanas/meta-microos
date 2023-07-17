SUMMARY = "Development files for libtexpdf"
DESCRIPTION = "A PDF library extracted from TeX's dvipdfmx. Used in software such as SILE. \
This package contains the development files for libtexpdf."
LICENSE = "GPL-2.0-or-later"

PV = "0.14.10"

RPM_NAME = "libtexpdf-devel-0.14.10-1.1.aarch64.rpm"
RPM_HASH = "4a41b58fe1727dbd34bb5d8d335e03ba3e080dd55a38bc1fd5c915fef6e2e017e8ea6bff7881a9f1be74bc98b9820cfb807879340adb77f6dc454e4f4b51662b"

RPROVIDES:${PN} += "libtexpdf-devel"

RDEPENDS:${PN} += "/sbin/ldconfig \
libtexpdf0"

inherit rpm
