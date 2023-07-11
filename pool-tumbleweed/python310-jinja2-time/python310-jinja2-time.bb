SUMMARY = "Jinja2 Extension for Dates and Times"
DESCRIPTION = "A Jinja2 extension providing support for dates and times."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python310-jinja2-time-0.2.0-4.3.noarch.rpm"
RPM_HASH = "de7933068bb919d12c6e386ba1f01de83cd984b0b0baea07816b51b331a5bb41637190f4d160e270a4093348629c81f71e0a4b934758f951623fd39586876feb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jinja2-time \
python310-jinja2-time \
python3dist-jinja2-time"

RDEPENDS:${PN} += "python-abi \
python310-Jinja2 \
python310-arrow"

inherit rpm
