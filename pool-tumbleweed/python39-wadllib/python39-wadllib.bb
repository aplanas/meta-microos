SUMMARY = "Navigate HTTP resources using WADL files as guides"
DESCRIPTION = "An Application object represents a web service described by a WADL \
file."
LICENSE = "LGPL-3.0-or-later"

PV = "1.3.6"

RPM_NAME = "python39-wadllib-1.3.6-1.8.noarch.rpm"
RPM_HASH = "ede281adccc99d4c102c451c4a8b178c2ea1e1c55f9e735b7c267f917fb4474b4cb757df1fa4b857619b69a76d252519df0c02139bd4a076c393328eb5e72f44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(wadllib) \
python39-wadllib \
python3dist(wadllib)"
RDEPENDS:${PN} += "python(abi) \
python39-lazr.uri"

inherit rpm
