SUMMARY = "Documentation for qt6-webchannel in QCH format"
DESCRIPTION = "This package contains documentation for qt6-webchannel in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-webchannel-docs-qch-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "c371862c63e2543982f140bd84a3294f1ead311350090bcf6ace1043babe60a2bc2b74c52c8c442cf5f87fb0687050a890f954321e024152cd823c56c8b63f15"

RPROVIDES:${PN} += "qt6-webchannel-docs-qch"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
