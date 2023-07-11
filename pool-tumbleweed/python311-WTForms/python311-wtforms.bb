SUMMARY = "A flexible forms validation and rendering library for Python web development"
DESCRIPTION = "WTForms is a forms validation and rendering library for Python web development. \
With WTForms, form field HTML can be generated and be customized with templates. \
This allows to maintain separation of code and presentation, and keep those parameters out of Python code. \
Because of this loose coupling, any template engine may be used for this."
LICENSE = "BSD-3-Clause"

PV = "3.0.1"

RPM_NAME = "python311-WTForms-3.0.1-2.8.noarch.rpm"
RPM_HASH = "ed5c925f5c0d97f54cc838fdcf1d458c1b1841518a3e5042ccf292664d38b0dc0111c6aa260478c334a9239e9cbd2b658b61e0c399234c5453687297eca27dd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-WTForms \
python3.11dist-wtforms \
python311-WTForms \
python3dist-wtforms"

RDEPENDS:${PN} += "python-abi \
python311-MarkupSafe \
python311-email-validator"

inherit rpm
