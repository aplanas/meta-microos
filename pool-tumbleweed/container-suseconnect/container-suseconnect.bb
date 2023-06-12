SUMMARY = "Provides access to repositories inside containers"
DESCRIPTION = "container-suseconnect gives access to package repositories inside containers \
using the host machine entitlements."
LICENSE = "Apache-2.0"

PV = "2.4.0"

RPM_NAME = "container-suseconnect-2.4.0-1.4.aarch64.rpm"
RPM_HASH = "a84bacfe743ee8534887dcc1dc737e4e2499dbe53f6da3a1afc538d857c69f27de113ac8ba42e6482c54458912ef4295ceaa4a7810dacbf65a3e305358bf4904"

RPROVIDES:${PN} += "container-suseconnect \
container-suseconnect(aarch-64)"
RDEPENDS:${PN} += "libzypp"

inherit rpm
