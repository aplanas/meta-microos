SUMMARY = "Irregular methods for regular expressions"
DESCRIPTION = "A command line tool and python module that generates all or random matching strings to a given regular expression and more."
LICENSE = "AGPL-3.0-or-later"

PV = "0.11.0"

RPM_NAME = "python39-exrex-0.11.0-1.3.noarch.rpm"
RPM_HASH = "505bbd00223c3b8486c6c0d00216dd41cfbca281866026fbc91a38e8eb4ddab7a2786865ed0b5bb7dc2fd2059fc408d1cbc41234a1bd335a33345d721192916a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-exrex \
python39-exrex \
python3dist-exrex"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-setuptools \
update-alternatives"

inherit rpm
