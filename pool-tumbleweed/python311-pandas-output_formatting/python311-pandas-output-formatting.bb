SUMMARY = "The python pandas[output_formatting] extra"
DESCRIPTION = "This package provides the [output_formatting] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python311-pandas-output_formatting-2.0.3-1.3.noarch.rpm"
RPM_HASH = "c54dcc6a867763520521e05cc93fa6b2ce0092e152519e1da651d8bde5ff5065ba0ed0cb23e8793a292a30952be8933eacd96c582470a76263ca83ec6169bffc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-output-formatting \
python311-pandas-output-formatting"

RDEPENDS:${PN} += "python311-Jinja2 \
python311-pandas \
python311-tabulate"

inherit rpm
