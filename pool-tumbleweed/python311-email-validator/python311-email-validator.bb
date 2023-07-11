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

RPM_NAME = "python311-email-validator-2.0.0-1.3.noarch.rpm"
RPM_HASH = "37b74969f77138a13e1e465b487fca56887b5a7d8de05d42ab9f37690359e7bd6756c10837212d3122cce19078f6781ec28df7db7b3819d9b08bf91bb61b643f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-email-validator \
python3.11dist-email-validator \
python311-email-validator \
python3dist-email-validator"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-dnspython \
python311-idna \
python311-setuptools \
update-alternatives"

inherit rpm
