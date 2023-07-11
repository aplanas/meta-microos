SUMMARY = "Automatically upgrade your Django projects"
DESCRIPTION = "Automatically upgrade your Django projects."
LICENSE = "MIT"

PV = "1.13.0"

RPM_NAME = "python310-django-upgrade-1.13.0-1.4.noarch.rpm"
RPM_HASH = "022a77c147ac39aef5e671ecc1f64c8e07484c922d5ec13bc9bab3a9879903aa69d9d9791617e50997485e4df2e00970a2e609c19a0dc80fc3f7542518175c03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-upgrade \
python310-django-upgrade \
python3dist-django-upgrade"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-tokenize-rt \
update-alternatives"

inherit rpm
