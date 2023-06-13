SUMMARY = "Office Software"
DESCRIPTION = "Office software for your desktop environment including LibreOffice."
LICENSE = "MIT"

PV = "20170506"

RPM_NAME = "patterns-office-office-20170506-3.12.aarch64.rpm"
RPM_HASH = "4c00e212b4afd69f5c15b0d3f2833a7504a4976014ba3cf919faa034c6df46a88efef349b0c28249fda1074e20f06f34a858167a873345ebdce620a48d97324d"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-icon() \
pattern-order() \
pattern-visible() \
patterns-office-office \
patterns-office-office(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
