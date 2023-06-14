SUMMARY = "A flexible forms validation and rendering library for Python web development"
DESCRIPTION = "WTForms is a forms validation and rendering library for Python web development. \
With WTForms, form field HTML can be generated and be customized with templates. \
This allows to maintain separation of code and presentation, and keep those parameters out of Python code. \
Because of this loose coupling, any template engine may be used for this."
LICENSE = "BSD-3-Clause"

PV = "3.0.1"

RPM_NAME = "python311-WTForms-3.0.1-2.6.noarch.rpm"
RPM_HASH = "5552d31e7611ffe3231479c4275abef71312904570d7acd401ae85f800592f01e25196606078f1897bff0c9b3e037300caa4094ef13a02b81058270b5c776920"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-wtforms \
python311-WTForms \
python3dist-wtforms"

RDEPENDS:${PN} += "python-abi \
python311-MarkupSafe \
python311-email-validator"

inherit rpm
