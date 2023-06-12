SUMMARY = "An HTML Minifier"
DESCRIPTION = "A configurable HTML Minifier with safety features."
LICENSE = "BSD-3-Clause"

PV = "0.1.12"

RPM_NAME = "python310-htmlmin-0.1.12-3.13.noarch.rpm"
RPM_HASH = "66dc7b0f84de027fff1a84bb282275b453efd1c935b33284b372b5adcbd55ae9952eab13cadedccc455b647f4fb70eba45263752b2c2e6bd891fb8cf7bcbb816"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-htmlmin \
python3.10dist(htmlmin) \
python310-htmlmin \
python3dist(htmlmin)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-setuptools \
update-alternatives"

inherit rpm
