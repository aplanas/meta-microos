SUMMARY = "HTTP/JSON wrapper around Jedi"
DESCRIPTION = "HTTP/JSON wrapper around Jedi primarily created to allow using \
jedi for python3 completion in YouCompleteMe."
LICENSE = "Apache-2.0"

PV = "0+git.1497381496.75b8b74"

RPM_NAME = "python311-jedihttp-0+git.1497381496.75b8b74-5.11.noarch.rpm"
RPM_HASH = "8912c7c15f5c98808d1c6bc2ecad89a92c71f5294b6d8753f1f9248b778a06744a293daedd1f985bde19290ab6ef2db198e00bd9300d1476f8c2b7e04041d192"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jedihttp \
python3.11dist-jedihttp \
python311-jedihttp \
python3dist-jedihttp"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-bottle \
python311-jedi \
python311-waitress \
update-alternatives"

inherit rpm
