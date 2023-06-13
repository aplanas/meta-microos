SUMMARY = "A reusable Django app for queuing the sending of email"
DESCRIPTION = "A reusable Django app for queuing and throttling of email sending, scheduled sending, \
consolidation of multiple notifications into single emails and logging of mail failures."
LICENSE = "MIT"

PV = "2.2"

RPM_NAME = "python39-django-mailer-2.2-1.6.noarch.rpm"
RPM_HASH = "bf7b227bcd8a4532f4d0ea3246cfce276981d9fa1152eccb1adc6a4a8eb06b5349034c9c2674b560e183a0f35c5d5e5d0b09c46a98c77f4fe9212d8fc3fc2df0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-mailer) \
python39-django-mailer \
python3dist(django-mailer)"

RDEPENDS:${PN} += "python(abi) \
python39-Django \
python39-lockfile \
python39-six"

inherit rpm
