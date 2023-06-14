SUMMARY = "A flexible forms validation and rendering library for Python web development"
DESCRIPTION = "WTForms is a forms validation and rendering library for Python web development. \
With WTForms, form field HTML can be generated and be customized with templates. \
This allows to maintain separation of code and presentation, and keep those parameters out of Python code. \
Because of this loose coupling, any template engine may be used for this."
LICENSE = "BSD-3-Clause"

PV = "3.0.1"

RPM_NAME = "python310-WTForms-3.0.1-2.6.noarch.rpm"
RPM_HASH = "615c0851234c428a9ad946415689d0a81d07fef713e0f86f833721d5393e0a2e483910cd099c6f350569523f86c80aeba3850746830a0279d90aba053426df2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-WTForms \
python3.10dist-wtforms \
python310-WTForms \
python3dist-wtforms"

RDEPENDS:${PN} += "python-abi \
python310-MarkupSafe \
python310-email-validator"

inherit rpm
