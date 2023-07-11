SUMMARY = "The 'Boltons' utility package for Python"
DESCRIPTION = "Boltons is a package containing over 160 utility types and functions \
that can be used as a package or independently. Documentation is on \
http://boltons.readthedocs.org."
LICENSE = "BSD-3-Clause"

PV = "21.0.0"

RPM_NAME = "python311-boltons-21.0.0-2.5.noarch.rpm"
RPM_HASH = "1d89b8a5ac1421b288e6b0573de2b554be9869635ab2fc8b0d5a5cb582d2b1632b4378addbbb639f6a86171a05421044ef628b8612c240821cbd440b84717480"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-boltons \
python3.11dist-boltons \
python311-boltons \
python3dist-boltons"

RDEPENDS:${PN} += "python-abi"

inherit rpm
