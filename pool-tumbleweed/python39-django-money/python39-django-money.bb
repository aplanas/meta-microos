SUMMARY = "Django support for using money and currency fields"
DESCRIPTION = "Django money and currency fields in models and forms."
LICENSE = "BSD-3-Clause"

PV = "3.0"

RPM_NAME = "python39-django-money-3.0-1.3.noarch.rpm"
RPM_HASH = "e50a9ead9067df6d7559330e9b7a71dcbf558eaf89cf230c13bfc2019b2c8ae694e1442c85687239ef4214b356f53d62aea1c38fc905c10877c91c10d21929c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-money) \
python39-django-money \
python3dist(django-money)"

RDEPENDS:${PN} += "python(abi) \
python39-Django \
python39-py-moneyed \
python39-setuptools"

inherit rpm
