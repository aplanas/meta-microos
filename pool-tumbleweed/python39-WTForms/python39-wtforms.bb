SUMMARY = "A flexible forms validation and rendering library for Python web development"
DESCRIPTION = "WTForms is a forms validation and rendering library for Python web development. \
With WTForms, form field HTML can be generated and be customized with templates. \
This allows to maintain separation of code and presentation, and keep those parameters out of Python code. \
Because of this loose coupling, any template engine may be used for this."
LICENSE = "BSD-3-Clause"

PV = "3.0.1"

RPM_NAME = "python39-WTForms-3.0.1-2.6.noarch.rpm"
RPM_HASH = "cd13745775d052215b4bc4063cda3b24443f95d457dbe05330ad7176bfb4f8a3ead4c23476ef2b121eb79daf5e6c51df764e442e406b11a0264d148798ef2ef9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(wtforms) \
python39-WTForms \
python3dist(wtforms)"
RDEPENDS:${PN} += "python(abi) \
python39-MarkupSafe \
python39-email-validator"

inherit rpm
