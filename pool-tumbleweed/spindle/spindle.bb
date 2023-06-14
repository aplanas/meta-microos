SUMMARY = "Scalable shared library loading in HPC environments"
DESCRIPTION = "Spindle is a tool for improving the performance of dynamic library \
and python loading in HPC environments."
LICENSE = "LGPL-2.1-only"

PV = "0.12.git.4815692"

RPM_NAME = "spindle-0.12.git.4815692-1.11.aarch64.rpm"
RPM_HASH = "6a31f5e6b226a72839d45bbda442336a0fa9bb271b3506e883e97ad1dddb9c813ea7a7f84a688135a1a7332eb049a7ee61b2537e4b916c0336edb46d00790965"

RPROVIDES:${PN} += "libompiintercept.so \
libprint-ldso-audit.so \
libspindle-audit-pipe.so \
libspindle-subaudit-pipe.so \
libspindle.so.0 \
libspindlebe.so.2 \
libspindlefe.so.2 \
libspindleint.so \
spindle"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmunge.so.2 \
libstdc++.so.6"

inherit rpm
