SUMMARY = "NAPALM - HP ProCurve/Aruba network driver"
DESCRIPTION = "Napalm driver for HP ProCurve/Aruba switches."
LICENSE = "Apache-2.0"

PV = "0.2.0"

RPM_NAME = "python310-napalm-digineo-procurve-0.2.0-3.6.noarch.rpm"
RPM_HASH = "f73a754955768e19e4648a57b5f89757800f94686f22a8bb546f9dc546fbb3a2340c508922682de8e160833ff0a41d23c74966b71ff313ae19da19622fcf0405"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-napalm-digineo-procurve \
python310-napalm-digineo-procurve \
python3dist-napalm-digineo-procurve"

RDEPENDS:${PN} += "python-abi \
python310-napalm"

inherit rpm
