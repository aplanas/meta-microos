SUMMARY = "The python pandas[output_formatting] extra"
DESCRIPTION = "This package provides the [output_formatting] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python310-pandas-output_formatting-2.1.0-1.2.noarch.rpm"
RPM_HASH = "ad584e95b9f44c186a2c24d705aeb9d60a374a0d9126653aaabfb58f29737e07c592b00e4294ba7e79013b5cbab6653f82e2a619ac5c7cf68e1f9af720149458"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-output-formatting"

RDEPENDS:${PN} += "python310-Jinja2 \
python310-pandas \
python310-tabulate"

inherit rpm
