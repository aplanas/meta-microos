SUMMARY = "Show User Information (Client)"
DESCRIPTION = "Finger is a utility that allows users to see information about system \
users (login name, home directory, name, and more) on local and remote \
systems."
LICENSE = "BSD-3-Clause"

PV = "1.3"

RPM_NAME = "finger-1.3-169.4.aarch64.rpm"
RPM_HASH = "3973ad4d5d1569cb7cceb70cdef5824a2724bc085b4954b92119a17404677c32cd95db91c28a48074fa7e76ba89fd4d032ee9b335fbb64a0e50a519cf54018ab"

RPROVIDES:${PN} += "finger"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnss-usrfiles2 \
netcfg"

inherit rpm
