SUMMARY = "Performance Co-Pilot (PCP) metrics for hardware sensors"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the Linux hardware monitoring sensors."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-lmsensors-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "a687dddb54946e3118a080ed8889df355b55834f7c5f7891acfe733c78eae1d90f32efdbd41841d26cfb145f2453b25340a20c49fb3cf971d20fca0bb3b8bb86"

RPROVIDES:${PN} += "pcp-pmda-lmsensors"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
python3-pcp"

inherit rpm
