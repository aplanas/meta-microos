SUMMARY = "The python pandas[output_formatting] extra"
DESCRIPTION = "This package provides the [output_formatting] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python39-pandas-output_formatting-2.0.3-1.3.noarch.rpm"
RPM_HASH = "a1612c65f01fb98c694a0a4b988f37db105687c73200f2e78cf0dc54f9ea2c0fcbf60b6a180586f6993272f57237568c2823dcd88ee742d2444d0c54dbf01b9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-output-formatting"

RDEPENDS:${PN} += "python39-Jinja2 \
python39-pandas \
python39-tabulate"

inherit rpm
