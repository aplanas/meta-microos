SUMMARY = "Development documentation for Qwt"
DESCRIPTION = "This package contains the development documentation of the Qwt widgets \
as is it created by doxygen."
LICENSE = "SUSE-QWT-1.0"

PV = "5.2.3_qt5+git20181129.2819734"

RPM_NAME = "qwt-devel-doc-5.2.3_qt5+git20181129.2819734-3.18.aarch64.rpm"
RPM_HASH = "b938f29b5b5e1a6e19d7aa8be68834763024f200b1dcc6802984505ba008eee21449f76e467322d4fec07a3b9e1602f1d22efb05126eed7181e591e956353021"

RPROVIDES:${PN} += "libqwt5-devel-doc \
qwt-devel-doc"

RDEPENDS:${PN} += "qwt-devel"

inherit rpm
