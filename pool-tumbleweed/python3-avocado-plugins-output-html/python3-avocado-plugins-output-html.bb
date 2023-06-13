SUMMARY = "Avocado HTML report plugin"
DESCRIPTION = "This plugin adds the ability for Avocado to generate an HTML report in every \
job result directory. It also gives the user the ability to write a report to \
an arbitrary filesystem location."
LICENSE = "GPL-2.0-only"

PV = "69.0"

RPM_NAME = "python3-avocado-plugins-output-html-69.0-6.10.noarch.rpm"
RPM_HASH = "94c8e0e8b00d4526a34f8e3a9363b4bfa49ab04307f8effe25ba0fbbe54760f9b0bbba077e0d4b030ad9f03a9dd976b71b8e75e73ad433f18602f78236aa1546"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-avocado-plugins-output-html \
python3.10dist(avocado-framework-plugin-result-html) \
python3dist(avocado-framework-plugin-result-html)"

RDEPENDS:${PN} += "python(abi) \
python3-avocado \
python3-pystache"

inherit rpm
