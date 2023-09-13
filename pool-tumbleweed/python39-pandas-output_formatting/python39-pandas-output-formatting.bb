SUMMARY = "The python pandas[output_formatting] extra"
DESCRIPTION = "This package provides the [output_formatting] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python39-pandas-output_formatting-2.1.0-1.2.noarch.rpm"
RPM_HASH = "c9155e81b8ca27d290a7d0d10458d09cd24b7d7db947ba6c78b3dd5ad633af5385f8b8302eef0116aa403487c5191aca4ca9649e7c89de6454f7fe0df578354d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-output-formatting"

RDEPENDS:${PN} += "python39-Jinja2 \
python39-pandas \
python39-tabulate"

inherit rpm
