SUMMARY = "A reusable Django app for queuing the sending of email"
DESCRIPTION = "A reusable Django app for queuing and throttling of email sending, scheduled sending, \
consolidation of multiple notifications into single emails and logging of mail failures."
LICENSE = "MIT"

PV = "2.2"

RPM_NAME = "python310-django-mailer-2.2-1.6.noarch.rpm"
RPM_HASH = "84f882f3d6e4eefa9602a894cf9fc06721d52d260ec7392c9d22be5aa092762b3468c0cc95a6fb335d4d46eabaf061a95f0d5fb2b8d1cfd707537a929eaaa2ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-mailer \
python3.10dist-django-mailer \
python310-django-mailer \
python3dist-django-mailer"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-lockfile \
python310-six"

inherit rpm
