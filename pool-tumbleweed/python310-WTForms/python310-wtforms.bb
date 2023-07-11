SUMMARY = "A flexible forms validation and rendering library for Python web development"
DESCRIPTION = "WTForms is a forms validation and rendering library for Python web development. \
With WTForms, form field HTML can be generated and be customized with templates. \
This allows to maintain separation of code and presentation, and keep those parameters out of Python code. \
Because of this loose coupling, any template engine may be used for this."
LICENSE = "BSD-3-Clause"

PV = "3.0.1"

RPM_NAME = "python310-WTForms-3.0.1-2.8.noarch.rpm"
RPM_HASH = "9d72959b972c4aacbe3b7511d631c5df4bac51a42a806199dad88130b5959bdd6da270a2d67349e60ae56748cc3776ac65690d5354958cadc70c306b20d98045"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-wtforms \
python310-WTForms \
python3dist-wtforms"

RDEPENDS:${PN} += "python-abi \
python310-MarkupSafe \
python310-email-validator"

inherit rpm
