SUMMARY = "Job-based library to send email through an SMTP server"
DESCRIPTION = "KSMTP is a job based library to send email through an SMTP server. This \
package contains the KSMTP library itself."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "libKPim5SMTP5-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "d87362f22489966d42d588f40acc42e02b3a4b4871ada59dc85dda9bc1cf3954790f9cc856fefa3c57780d0be01061474d3205d25de862641103ac5f87ebea98"

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
