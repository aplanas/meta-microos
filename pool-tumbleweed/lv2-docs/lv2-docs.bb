SUMMARY = "LV2 documentation"
DESCRIPTION = "LV2 is a plugin standard for audio systems, similar in scope to LADSPA, \
VST, AU, and others. It defines a C API for code and a format for data files \
which collectively describe a plugin. LV2 consists of a core (roughly \
equivalent in power to LADSPA) which can be extended to support more \
functionality. \
This package contains the LV2 API documentation."
LICENSE = "ISC"

PV = "1.18.10"

RPM_NAME = "lv2-docs-1.18.10-2.1.noarch.rpm"
RPM_HASH = "90de4e39e3f72a98794546686525814f4be93a343aca5d6e598cfdeb641e01cb564fcccb865746e14acb026b2df43613ab06a20c60e0b63b0e7ff3587f1a5b2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lv2-docs"

RDEPENDS:${PN} += "lv2"

inherit rpm
