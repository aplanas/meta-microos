SUMMARY = "The python pandas[xml] extra"
DESCRIPTION = "This package provides the [xml] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python39-pandas-xml-2.0.3-1.3.noarch.rpm"
RPM_HASH = "c41258b3cc808b0bfbef088211b20caf727d06e002b6338e7621d0240d613ee78f66bd23d266861f33b31b8b50929001160469c186e0dcdc3e3dd89a40fc0cce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-xml"

RDEPENDS:${PN} += "python39-lxml \
python39-pandas"

inherit rpm
