SUMMARY = "Job-based library to send email through an SMTP server"
DESCRIPTION = "KSMTP is a job based library to send email through an SMTP server."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "ksmtp-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "cd63df8fe114b72f21cf0ffaa8ee02c6570ea9fc8e9781724b366beee28142f542583dc8075781f2318e238b0273b8699090b5f2b9701e7f8f82b3bd9188e6e2"

RPROVIDES:${PN} += "ksmtp"

RDEPENDS:${PN} += ""

inherit rpm
