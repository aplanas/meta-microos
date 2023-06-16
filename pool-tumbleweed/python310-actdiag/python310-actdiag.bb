SUMMARY = "Text to activity-diagram image generator"
DESCRIPTION = "actdiag generates activity-diagram image files from spec-text files."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "python310-actdiag-3.0.0-1.5.noarch.rpm"
RPM_HASH = "13d77d7a5e281b7c729aec580ac3931cfca444a58458b9dc91a64529363343d86fdc26332da3c334084dd5a84a90e37fad4655f2ea81e44d77dcd5c33d1a8d89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-actdiag \
python3.10dist-actdiag \
python310-actdiag \
python3dist-actdiag"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-blockdiag \
python310-setuptools \
update-alternatives"

inherit rpm
