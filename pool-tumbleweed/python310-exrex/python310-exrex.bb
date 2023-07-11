SUMMARY = "Irregular methods for regular expressions"
DESCRIPTION = "A command line tool and python module that generates all or random matching strings to a given regular expression and more."
LICENSE = "AGPL-3.0-or-later"

PV = "0.11.0"

RPM_NAME = "python310-exrex-0.11.0-1.3.noarch.rpm"
RPM_HASH = "9800c004e323339b259c0f22db997165414c21a81643961fa3010b8616ce3251401ce3af1724eadc54ecace1fd74c729d72aaf21595de66139c546bebfb933d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-exrex \
python310-exrex \
python3dist-exrex"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-setuptools \
update-alternatives"

inherit rpm
