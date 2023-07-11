SUMMARY = "A skin for the Django Admin-Interface"
DESCRIPTION = "A jazzy skin for the Django Admin-Interface."
LICENSE = "BSD-2-Clause & LGPL-2.1-or-later"

PV = "3.0.6"

RPM_NAME = "python39-django-grappelli-3.0.6-1.3.noarch.rpm"
RPM_HASH = "0bab750f5d0b3fb4ab958771c73aa64fd99fa1e81c219678bee804b34707150f02a37299782f6469a6c181eb2650a7138af47acc664e35a2dbdb6e2585692eeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-grappelli \
python39-django-grappelli \
python3dist-django-grappelli"

RDEPENDS:${PN} += "python-abi \
python39-Django"

inherit rpm
