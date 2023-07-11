SUMMARY = "Development documentation for Qwt"
DESCRIPTION = "This package contains the development documentation of the Qwt widgets \
as is it created by doxygen."
LICENSE = "SUSE-QWT-1.0"

PV = "5.2.3_qt5+git20181129.2819734"

RPM_NAME = "qwt-devel-doc-5.2.3_qt5+git20181129.2819734-3.19.aarch64.rpm"
RPM_HASH = "f7df35555cf3c489ca0dc6a6996694eefcb7efcd22237045af06f590c0f0ef93029253177297e7681291eeb07aa5eb81030f3d37bc438cf95e282f306e1934ca"

RPROVIDES:${PN} += "libqwt5-devel-doc \
qwt-devel-doc"

RDEPENDS:${PN} += "qwt-devel"

inherit rpm
