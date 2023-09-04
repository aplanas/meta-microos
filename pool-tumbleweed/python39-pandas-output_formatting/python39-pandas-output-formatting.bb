SUMMARY = "The python pandas[output_formatting] extra"
DESCRIPTION = "This package provides the [output_formatting] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python39-pandas-output_formatting-2.0.3-1.2.noarch.rpm"
RPM_HASH = "c92fb9742b09f2eed98cd83539bec0d233e2ecc50f77094d7f6d89bcfefb01efd72e5af82761c54490b96fc0f68d36cb326db9e1b384cc36939c0b5ca7114ed6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-output-formatting"

RDEPENDS:${PN} += "python39-Jinja2 \
python39-pandas \
python39-tabulate"

inherit rpm
