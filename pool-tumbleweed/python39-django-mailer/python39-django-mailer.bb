SUMMARY = "A reusable Django app for queuing the sending of email"
DESCRIPTION = "A reusable Django app for queuing and throttling of email sending, scheduled sending, \
consolidation of multiple notifications into single emails and logging of mail failures."
LICENSE = "MIT"

PV = "2.2"

RPM_NAME = "python39-django-mailer-2.2-1.8.noarch.rpm"
RPM_HASH = "4a12f200aac1e334f453dbfeb375a7994f056cf2c3c2575006b64f723b323d2b65d03d26bb024ed7a34189add39d27f2797d040ad6f6a37f1c335486ca7fca36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-mailer \
python39-django-mailer \
python3dist-django-mailer"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-lockfile \
python39-six"

inherit rpm
