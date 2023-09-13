SUMMARY = "The python pandas[xml] extra"
DESCRIPTION = "This package provides the [xml] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python311-pandas-xml-2.1.0-1.2.noarch.rpm"
RPM_HASH = "3360e05d116df52d1691165ed711ae6dc9d320d2bc508019e5e053367ffb39e22e36ba4cecad4b2891434f81896208cbbffda2dc4837ad3dba97500c02966f97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-xml \
python311-pandas-xml"

RDEPENDS:${PN} += "python311-lxml \
python311-pandas"

inherit rpm
