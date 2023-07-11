SUMMARY = "A reusable Django app for queuing the sending of email"
DESCRIPTION = "A reusable Django app for queuing and throttling of email sending, scheduled sending, \
consolidation of multiple notifications into single emails and logging of mail failures."
LICENSE = "MIT"

PV = "2.2"

RPM_NAME = "python311-django-mailer-2.2-1.8.noarch.rpm"
RPM_HASH = "cfdf603b4892866a44dfcf35ba60b6d8d1b782cace0f7329edda2ae69385cb3f91bb8cc959e2dbfc2abc110517f4603c21484fcf714b6c988af1cebd75b4bc71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-mailer \
python3.11dist-django-mailer \
python311-django-mailer \
python3dist-django-mailer"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-lockfile \
python311-six"

inherit rpm
