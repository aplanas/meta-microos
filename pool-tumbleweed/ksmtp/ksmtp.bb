SUMMARY = "Job-based library to send email through an SMTP server"
DESCRIPTION = "KSMTP is a job based library to send email through an SMTP server."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "ksmtp-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "bc027e61da9de191ac98a061985e1bf2c20bbccb5f50c3b211bc47817df64bf955dc8c58ab06269dd1aea9cb090ecaf1e56a664338823825c26ce5ddb641045b"

RPROVIDES:${PN} += "ksmtp"

RDEPENDS:${PN} += ""

inherit rpm
