SUMMARY = "Development files for the procmeter system parameter display program"
DESCRIPTION = "With procmeter, one can display various system parameters, e.g. \
processor load, network load, etc. \
 \
This package provides files needed to build modules for procmeter."
LICENSE = "GPL-2.0-or-later"

PV = "3.6+svn415"

RPM_NAME = "procmeter-devel-3.6+svn415-2.1.aarch64.rpm"
RPM_HASH = "5eb2a7616a5fb014edcbe36214160540625c5d4693a895bd48f13cb02468ebaf44bca6552963508d9ea109f9344fb62520c53e909447c98a4c153c686c3ac83e"

RPROVIDES:${PN} += "procmeter-devel"

RDEPENDS:${PN} += "procmeter"

inherit rpm
