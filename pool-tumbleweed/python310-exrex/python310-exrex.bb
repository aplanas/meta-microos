SUMMARY = "Irregular methods for regular expressions"
DESCRIPTION = "A command line tool and python module that generates all or random matching strings to a given regular expression and more."
LICENSE = "AGPL-3.0-or-later"

PV = "0.11.0"

RPM_NAME = "python310-exrex-0.11.0-1.2.noarch.rpm"
RPM_HASH = "f883f71a4a936432a451fa31ceb7d3c0c31d62a0633bdfeef26906fe5f07cc4da40c0d8a0f18e45fffab2685dcdadf910bf135f7ba829340326707b1ae5cd3c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-exrex \
python3.10dist(exrex) \
python310-exrex \
python3dist(exrex)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-setuptools \
update-alternatives"

inherit rpm
