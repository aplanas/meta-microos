SUMMARY = "The python pandas[output_formatting] extra"
DESCRIPTION = "This package provides the [output_formatting] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python311-pandas-output_formatting-2.0.2-4.1.noarch.rpm"
RPM_HASH = "ff112de1adac461f268eab8d8e23d4ba451aecd757e81cbc4c025c38b85eddf421f3f6cf865cf4a4af5dcda303e3d869e3550927c885d44188d96fff47cf41e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-output-formatting \
python311-pandas-output-formatting"

RDEPENDS:${PN} += "python311-Jinja2 \
python311-pandas \
python311-tabulate"

inherit rpm
