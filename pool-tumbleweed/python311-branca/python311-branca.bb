SUMMARY = "HTML+JS page generator"
DESCRIPTION = "Generate HTML+JS pages with Python."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python311-branca-0.6.0-2.3.noarch.rpm"
RPM_HASH = "64b4ed56a0b6ed9cf6538820cb31655dd2a76d624ce7de29ec50ce4b0ca3fad3449f52180abf57b652537ccc0da4f711f00449723bb662fd0f8ad63e51f4fe93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-branca \
python311-branca \
python3dist-branca"

RDEPENDS:${PN} += "python-abi \
python311-Jinja2"

inherit rpm
