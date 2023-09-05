SUMMARY = "Terminal session recorder"
DESCRIPTION = "Record of terminal sessions and sharing them on the web."
LICENSE = "GPL-3.0-or-later"

PV = "2.3.0"

RPM_NAME = "asciinema-2.3.0-1.1.noarch.rpm"
RPM_HASH = "b828758086cee8c09160b54bc43a21a068b08918db47d24ea962a57204981c3929f47f82014499f268129cffe78fc8ad1e712fc87f8539f31235376b6e38cdf8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "asciinema \
python3.11dist-asciinema \
python3dist-asciinema"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
python-abi"

inherit rpm
