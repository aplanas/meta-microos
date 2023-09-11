SUMMARY = "The python pandas[xml] extra"
DESCRIPTION = "This package provides the [xml] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python311-pandas-xml-2.0.3-1.3.noarch.rpm"
RPM_HASH = "37af4ba742f0168d4b2e394691eb7c1e4cc6dba9424772c98ad4efa4a81a98fb5d9d1abfb02ade2119fec56c6c15a6a1e02ecfbab4d4e065576d24db115b6e8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-xml \
python311-pandas-xml"

RDEPENDS:${PN} += "python311-lxml \
python311-pandas"

inherit rpm
