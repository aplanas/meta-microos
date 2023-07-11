SUMMARY = "Country-specific Django helpers"
DESCRIPTION = "Country-specific Django helpers."
LICENSE = "BSD-3-Clause"

PV = "4.0"

RPM_NAME = "python310-django-localflavor-4.0-1.3.noarch.rpm"
RPM_HASH = "325def5a4a2f29e28445d8baa5417eef5f0659e04e02fb60a8ff9c77f3048f932429835d29bcd01c0291d449d93c33ee2fe92939572658a43d9be6fd049690b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-localflavor \
python310-django-localflavor \
python3dist-django-localflavor"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-python-stdnum"

inherit rpm
