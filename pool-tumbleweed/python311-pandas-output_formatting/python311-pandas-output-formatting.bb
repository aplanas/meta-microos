SUMMARY = "The python pandas[output_formatting] extra"
DESCRIPTION = "This package provides the [output_formatting] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python311-pandas-output_formatting-2.0.3-1.2.noarch.rpm"
RPM_HASH = "e9ea937029694f384fc20ed4a0ddccaa1dea769bb947141f0ed86a9734c4436921cc573489a34bf90ab8abb754cc34c79ce080b28f4d82be741afc502e1206bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-output-formatting \
python311-pandas-output-formatting"

RDEPENDS:${PN} += "python311-Jinja2 \
python311-pandas \
python311-tabulate"

inherit rpm
