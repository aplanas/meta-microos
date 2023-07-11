SUMMARY = "Avocado HTML report plugin"
DESCRIPTION = "This plugin adds the ability for Avocado to generate an HTML report in every \
job result directory. It also gives the user the ability to write a report to \
an arbitrary filesystem location."
LICENSE = "GPL-2.0-only"

PV = "69.0"

RPM_NAME = "python3-avocado-plugins-output-html-69.0-6.11.noarch.rpm"
RPM_HASH = "9548cb96a3658e8ce2bc0aa951cb39290944c28bc49ffb4817349bcdec6fada249be20c82099ec7b84583f0cb4e6694f37478b8540d78ee416a94e8aba27d8ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-avocado-plugins-output-html \
python3.11dist-avocado-framework-plugin-result-html \
python3dist-avocado-framework-plugin-result-html"

RDEPENDS:${PN} += "python-abi \
python3-avocado \
python3-pystache"

inherit rpm
