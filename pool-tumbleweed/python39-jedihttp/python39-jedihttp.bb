SUMMARY = "HTTP/JSON wrapper around Jedi"
DESCRIPTION = "HTTP/JSON wrapper around Jedi primarily created to allow using \
jedi for python3 completion in YouCompleteMe."
LICENSE = "Apache-2.0"

PV = "0+git.1497381496.75b8b74"

RPM_NAME = "python39-jedihttp-0+git.1497381496.75b8b74-5.9.noarch.rpm"
RPM_HASH = "994470130c231297134fbfb9cb9fb8b3bb9be6d33715028cbddb0868685bd5dabfc46faa83c5d52ada3ef64b7053b6d7b3b25e78499c99988055be6a27443362"
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
