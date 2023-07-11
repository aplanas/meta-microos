SUMMARY = "HTTP/JSON wrapper around Jedi"
DESCRIPTION = "HTTP/JSON wrapper around Jedi primarily created to allow using \
jedi for python3 completion in YouCompleteMe."
LICENSE = "Apache-2.0"

PV = "0+git.1497381496.75b8b74"

RPM_NAME = "python39-jedihttp-0+git.1497381496.75b8b74-5.11.noarch.rpm"
RPM_HASH = "05c4847c7d9e9d1c1eccb6bba9c5f3b5d419f8ee3af9abf98842346b6e8f60f02ad903f2ac74fa3e2a33b022aac3872734fa5961215f8c8022f48b8d0ec477e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jedihttp \
python39-jedihttp \
python3dist-jedihttp"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-bottle \
python39-jedi \
python39-waitress \
update-alternatives"

inherit rpm
