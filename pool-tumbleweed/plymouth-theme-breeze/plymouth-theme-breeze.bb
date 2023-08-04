SUMMARY = "Plymouth 'Breeze' theme"
DESCRIPTION = "This package contains the 'breeze' boot splash theme for \
Plymouth."
LICENSE = "GPL-2.0+"

PV = "5.27.7"

RPM_NAME = "plymouth-theme-breeze-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "94612bbb9c8afeba525bfe6eb4900f9718b2518a77485fd8f68df7aadd990929e5b94e348c37fc9cb0ccec72b325a395aff28221b5d62eabd291cfdf4eef1316"

RPROVIDES:${PN} += "plymouth-theme-breeze"

RDEPENDS:${PN} += "plymouth-plugin-label-ft \
plymouth-scripts \
plymouth-theme-breeze-plugin-breeze"

inherit rpm
