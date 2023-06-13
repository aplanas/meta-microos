SUMMARY = "Job-based library to send email through an SMTP server"
DESCRIPTION = "KSMTP is a job based library to send email through an SMTP server. This \
package contains the KSMTP library itself."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libKPim5SMTP5-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "dcef537c75feec8c76f456da47d2b114eac664462f6dd23410dd9bf664647d5a5a48855f097a09a317bc4ea9a184f7c6472a6cf55ab051d6b8274775f9ee01fc"

RPROVIDES:${PN} += "libKPim5SMTP.so.5()(64bit) \
libKPim5SMTP5 \
libKPim5SMTP5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libsasl2.so.3()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
