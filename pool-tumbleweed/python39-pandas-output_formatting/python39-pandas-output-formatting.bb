SUMMARY = "The python pandas[output_formatting] extra"
DESCRIPTION = "This package provides the [output_formatting] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python39-pandas-output_formatting-2.0.2-4.1.noarch.rpm"
RPM_HASH = "00b743ad3736d842b58716f1d7145499f57f960d9f5e72fcce3c7cf6c7d8f6cb8e3d6c13d8e2cede36db7761000b0d94f2eb65cfc296a776dcc1be661b23b84f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-output-formatting"

RDEPENDS:${PN} += "python39-Jinja2 \
python39-pandas \
python39-tabulate"

inherit rpm
