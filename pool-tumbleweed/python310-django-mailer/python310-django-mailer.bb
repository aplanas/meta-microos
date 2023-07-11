SUMMARY = "A reusable Django app for queuing the sending of email"
DESCRIPTION = "A reusable Django app for queuing and throttling of email sending, scheduled sending, \
consolidation of multiple notifications into single emails and logging of mail failures."
LICENSE = "MIT"

PV = "2.2"

RPM_NAME = "python310-django-mailer-2.2-1.8.noarch.rpm"
RPM_HASH = "cdadeda588826287a1b989c075aeaac66bf0b3a24fccfd3613d2d66a0135d18930af4680a770835a29c08c4d51161cc3a3feb3e4264ec2c63467a91f5a99aace"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-mailer \
python310-django-mailer \
python3dist-django-mailer"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-lockfile \
python310-six"

inherit rpm
