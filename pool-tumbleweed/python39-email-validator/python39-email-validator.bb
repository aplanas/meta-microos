SUMMARY = "A robust email syntax and deliverability validation library for Python"
DESCRIPTION = "A robust email address syntax and deliverability validation library \
for Python 2.7/3.4 by Joshua Tauberer. \
 \
This library validates that address are of the form ``x@y.com``. This is \
the sort of validation you would want for a login form on a website. \
 \
Key features: \
 \
* Good for validating email addresses used for logins/identity. \
* Friendly error messages when validation fails (appropriate to show to end users). \
* (optionally) Checks deliverability: Does the domain name resolve? \
* Supports internationalized domain names and (optionally) internationalized local parts. \
* Normalizes email addresses (super important for internationalized addresses! see below)."
LICENSE = "CC0-1.0"

PV = "2.0.0"

RPM_NAME = "python39-email-validator-2.0.0-1.3.noarch.rpm"
RPM_HASH = "b87cbc3f83e93def0d3f0693f9bb8e4b7e08b9a4b3901f81302889c97700afd384bae241df60c57accfb550dc95ff4d256f83b9205adc0656686ff4a94940604"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-email-validator \
python39-email-validator \
python3dist-email-validator"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-dnspython \
python39-idna \
python39-setuptools \
update-alternatives"

inherit rpm
