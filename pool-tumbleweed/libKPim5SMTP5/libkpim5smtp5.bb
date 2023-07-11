SUMMARY = "Job-based library to send email through an SMTP server"
DESCRIPTION = "KSMTP is a job based library to send email through an SMTP server. This \
package contains the KSMTP library itself."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "libKPim5SMTP5-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "19f0fd6acfad4820601b2c264463222688abc7206e2281d890f66389e52bcb4dad637e139e2523bbb0b8d83d5df795602e819db9eb5d1b37bb0c32000e128ef2"

RPROVIDES:${PN} += "libKPim5SMTP.so.5 \
libKPim5SMTP5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libsasl2.so.3 \
libstdc++.so.6"

inherit rpm
