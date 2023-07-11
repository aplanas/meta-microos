SUMMARY = "Bootstrap support for Django projects"
DESCRIPTION = "Bootstrap support for Django projects."
LICENSE = "BSD-3-Clause"

PV = "21.2"

RPM_NAME = "python39-django-bootstrap4-21.2-1.13.noarch.rpm"
RPM_HASH = "806134db660d874b91dcb59730b61c7bcdd67bd0669798d4ec715c1e7dc40531838137b4b914e41001d01a4c5e33c733bed113e06582319e6702761ed01c101b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-bootstrap4 \
python39-django-bootstrap4 \
python3dist-django-bootstrap4"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-beautifulsoup4"

inherit rpm
