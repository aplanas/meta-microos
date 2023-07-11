SUMMARY = "An HTML Minifier"
DESCRIPTION = "A configurable HTML Minifier with safety features."
LICENSE = "BSD-3-Clause"

PV = "0.1.12"

RPM_NAME = "python39-htmlmin-0.1.12-3.15.noarch.rpm"
RPM_HASH = "6cb38e824dd46328e3b7e548243c526cde0589751341398d7ee0dae23fa29f13160c07249a69c9e291b76638bf04c8700db6622490193f65a4081573ccacdc57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-htmlmin \
python39-htmlmin \
python3dist-htmlmin"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-setuptools \
update-alternatives"

inherit rpm
