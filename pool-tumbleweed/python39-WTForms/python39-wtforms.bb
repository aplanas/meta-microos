SUMMARY = "A flexible forms validation and rendering library for Python web development"
DESCRIPTION = "WTForms is a forms validation and rendering library for Python web development. \
With WTForms, form field HTML can be generated and be customized with templates. \
This allows to maintain separation of code and presentation, and keep those parameters out of Python code. \
Because of this loose coupling, any template engine may be used for this."
LICENSE = "BSD-3-Clause"

PV = "3.0.1"

RPM_NAME = "python39-WTForms-3.0.1-2.8.noarch.rpm"
RPM_HASH = "cad16240152331354c3533acb89868384f80e029035fc63978e17d07f8dd719bdf9af36e88f4eb4f1a22c272f45d57732469d70a4309b6f3f6aa44438a223ecc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-wtforms \
python39-WTForms \
python3dist-wtforms"

RDEPENDS:${PN} += "python-abi \
python39-MarkupSafe \
python39-email-validator"

inherit rpm
