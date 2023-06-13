SUMMARY = "Header files for reiser4progs's application abstraction mechanism library"
DESCRIPTION = "libaal includes device abstraction, libc independence code, and more."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.7"

RPM_NAME = "libaal-devel-1.0.7-2.13.aarch64.rpm"
RPM_HASH = "5cbcb825cd3a955ce0ac47ab4d671c72e474c2464f8354745cf1c9e770b5f53b37eb3b3675f187f84e35db26f5b56d60c60c46d8cef21fba801d32246d14398d"

RPROVIDES:${PN} += "libaal-devel \
libaal-devel(aarch-64)"

RDEPENDS:${PN} += "libaal-1_0-7 \
libaal-minimal0"

inherit rpm
