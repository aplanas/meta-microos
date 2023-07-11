SUMMARY = "Scalable shared library loading in HPC environments"
DESCRIPTION = "Spindle is a tool for improving the performance of dynamic library \
and python loading in HPC environments."
LICENSE = "LGPL-2.1-only"

PV = "0.12.git.4815692"

RPM_NAME = "spindle-0.12.git.4815692-1.12.aarch64.rpm"
RPM_HASH = "1ca9d4fc6d9e0aac267a09ff5ab7b13d3b834855140e35f2acf25deb60272334aeaf2432816a031cf5f4404b19abda8ea19f633b4aacce71bd46630e7e8cf123"

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
