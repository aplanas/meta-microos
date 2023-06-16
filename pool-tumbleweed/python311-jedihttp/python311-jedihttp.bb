SUMMARY = "HTTP/JSON wrapper around Jedi"
DESCRIPTION = "HTTP/JSON wrapper around Jedi primarily created to allow using \
jedi for python3 completion in YouCompleteMe."
LICENSE = "Apache-2.0"

PV = "0+git.1497381496.75b8b74"

RPM_NAME = "python311-jedihttp-0+git.1497381496.75b8b74-5.9.noarch.rpm"
RPM_HASH = "c1b2894828d38b442451393000ed0d1df9f6cfc474eb2d92c15db72bc1a50376e95e9e49bf114eba8075e112ae098bdb4343440c23c64c2c49014881f74807e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-jedihttp \
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
