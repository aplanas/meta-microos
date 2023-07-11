SUMMARY = "Django utility application that returns client's real IP address"
DESCRIPTION = "A Django utility application that returns client's real IP address."
LICENSE = "MIT"

PV = "5.0.0"

RPM_NAME = "python39-django-ipware-5.0.0-1.3.noarch.rpm"
RPM_HASH = "7d03ef67aa9e05e4e8b4a9091d90446ebb01a5fb5da4a0bf60fcf587e03f5d5c2988a4c1b1c65c2a3d1cc4ae3b95ffd5124642a9bb9f4d19aa65b84f063d1d6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-ipware \
python39-django-ipware \
python3dist-django-ipware"

RDEPENDS:${PN} += "python-abi \
python39-Django"

inherit rpm
