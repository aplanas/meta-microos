SUMMARY = "Extends the python-rich library functionality"
DESCRIPTION = "Extends the python-rich library functionality \
with a set of changes that were not accepted to rich itself."
LICENSE = "MIT"

PV = "1.2.7"

RPM_NAME = "python39-enrich-1.2.7-3.3.noarch.rpm"
RPM_HASH = "df1326870cabc5bb9341473d20f61953da526eeff6d28d69f83b300cd4e3e04e6733b1d2f431f954cd24121b1eb0e40f7e34582800adc927142786d499c7da78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-enrich \
python39-enrich \
python3dist-enrich"

RDEPENDS:${PN} += "python-abi \
python3.9dist-rich \
python39-rich"

inherit rpm
