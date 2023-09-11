SUMMARY = "The python pandas[output_formatting] extra"
DESCRIPTION = "This package provides the [output_formatting] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python310-pandas-output_formatting-2.0.3-1.3.noarch.rpm"
RPM_HASH = "c65445520bb9bb95dd3b0bed2d4c21e19faf48c2eb41b82923646ed8a551a65f6e363be0ccd733e4db7a327058d5cd81649b30671d90f8dd5cdf5296237bed1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-output-formatting"

RDEPENDS:${PN} += "python310-Jinja2 \
python310-pandas \
python310-tabulate"

inherit rpm
