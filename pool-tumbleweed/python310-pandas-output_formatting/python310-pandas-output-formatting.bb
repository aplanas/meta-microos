SUMMARY = "The python pandas[output_formatting] extra"
DESCRIPTION = "This package provides the [output_formatting] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python310-pandas-output_formatting-2.0.2-4.1.noarch.rpm"
RPM_HASH = "289b88e3dc497fa33e5f07b5686fa0e943bc732d23e8837b591e3a169687113f4b2fddec36b8df44413dbc6892272b2dd706601777af387d073ea0aa9d87c256"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-output-formatting"

RDEPENDS:${PN} += "python310-Jinja2 \
python310-pandas \
python310-tabulate"

inherit rpm
