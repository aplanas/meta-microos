SUMMARY = "Jinja2 Extension for Dates and Times"
DESCRIPTION = "A Jinja2 extension providing support for dates and times."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python39-jinja2-time-0.2.0-4.3.noarch.rpm"
RPM_HASH = "c8d55dcbd4b1289314c3168fc92bfa6b25f20fddb853963d72f5b1572337737445cc3033f099b52d91b1f7ca7696c8569935c46d337de037790217fbe60a8ed9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jinja2-time \
python39-jinja2-time \
python3dist-jinja2-time"

RDEPENDS:${PN} += "python-abi \
python39-Jinja2 \
python39-arrow"

inherit rpm
