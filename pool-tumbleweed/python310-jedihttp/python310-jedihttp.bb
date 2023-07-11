SUMMARY = "HTTP/JSON wrapper around Jedi"
DESCRIPTION = "HTTP/JSON wrapper around Jedi primarily created to allow using \
jedi for python3 completion in YouCompleteMe."
LICENSE = "Apache-2.0"

PV = "0+git.1497381496.75b8b74"

RPM_NAME = "python310-jedihttp-0+git.1497381496.75b8b74-5.11.noarch.rpm"
RPM_HASH = "ca3f587c0168519393a5f4d2efcab7c303e2aca2ba8b03f23e4e8f35efe84c112e12f80da0d2117a47b8ce642984116b3539c39d1f455f4c4eeab35cd4e700a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jedihttp \
python310-jedihttp \
python3dist-jedihttp"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-bottle \
python310-jedi \
python310-waitress \
update-alternatives"

inherit rpm
