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

RPM_NAME = "python310-email-validator-2.0.0-1.3.noarch.rpm"
RPM_HASH = "f760c727d362793768572d75ae3d9aa0acf8e9603863df2d54e889f77f5b7eef711070c3a04270fb99d177d6bf5ebcd60e6c23a0c4bce25245c2287bc1e56bb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-email-validator \
python310-email-validator \
python3dist-email-validator"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-dnspython \
python310-idna \
python310-setuptools \
update-alternatives"

inherit rpm
