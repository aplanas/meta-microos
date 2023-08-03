SUMMARY = "Documentation for qt6-webchannel in HTML format"
DESCRIPTION = "This package contains documentation for qt6-webchannel in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-webchannel-docs-html-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "23af63baece591ec2d97f217acf59e98343ceac12e08b953a80a25b9b67665078bb8711f1bf9aa19e4dddcb9bc8127e586ad01bb599f0a1745b3c63c65ff8997"

RPROVIDES:${PN} += "qt6-webchannel-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
