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

RPM_NAME = "python311-email-validator-2.0.0-1.1.noarch.rpm"
RPM_HASH = "18228cbe8d86cf4316b2b1be9f3e5b418fa1167175d6657c2e76b99d280a331eb70eecd033f8e7907dde93bbd07e038679984fdb6b6abc6254b0e8114d4ede87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-email-validator \
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
