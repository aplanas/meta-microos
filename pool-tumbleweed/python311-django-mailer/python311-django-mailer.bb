SUMMARY = "A reusable Django app for queuing the sending of email"
DESCRIPTION = "A reusable Django app for queuing and throttling of email sending, scheduled sending, \
consolidation of multiple notifications into single emails and logging of mail failures."
LICENSE = "MIT"

PV = "2.2"

RPM_NAME = "python311-django-mailer-2.2-1.6.noarch.rpm"
RPM_HASH = "ae58e8d648fd762cb04a06746551da8ffde1d6de3b657419cd7697a0bbcbde5394687813fb1dc21b275111b2d83c83f468f161cf0769446bbd31f07551bef7cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-django-mailer \
python311-django-mailer \
python3dist-django-mailer"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-lockfile \
python311-six"

inherit rpm
