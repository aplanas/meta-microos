SUMMARY = "Bootstrap support for Django projects"
DESCRIPTION = "Bootstrap support for Django projects."
LICENSE = "BSD-3-Clause"

PV = "21.2"

RPM_NAME = "python311-django-bootstrap4-21.2-1.13.noarch.rpm"
RPM_HASH = "e2f6522eb3571f19fbb3d9a894e70d9706792bee88c5c3996972025968c1586a86f735b77b3ae8fe20724a12f37c4ba12d4bc7f6757ef8f19b8a2560f30ea4a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-bootstrap4 \
python3.11dist-django-bootstrap4 \
python311-django-bootstrap4 \
python3dist-django-bootstrap4"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-beautifulsoup4"

inherit rpm
