SUMMARY = "Development files for libtexpdf"
DESCRIPTION = "A PDF library extracted from TeX's dvipdfmx. Used in software such as SILE. \
This package contains the development files for libtexpdf."
LICENSE = "GPL-2.0-or-later"

PV = "0.14.11"

RPM_NAME = "libtexpdf-devel-0.14.11-1.1.aarch64.rpm"
RPM_HASH = "b5e74f4b22a973ba439a7c372d5c3d2eb1124c36a1746de95054ff0157abfda7d807bef5af8d27363afdde07914fecfd2386eb92f9f786cc0aa8109da0c58bc4"

RPROVIDES:${PN} += "libtexpdf-devel"

RDEPENDS:${PN} += "/sbin/ldconfig \
libtexpdf0"

inherit rpm
