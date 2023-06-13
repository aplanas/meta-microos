SUMMARY = "Flask extension for sending email"
DESCRIPTION = "A Flask extension for sending email messages."
LICENSE = "BSD-3-Clause"

PV = "0.9.1"

RPM_NAME = "python39-Flask-Mail-0.9.1-3.6.noarch.rpm"
RPM_HASH = "47c585d11ebbaef93eee9fcff8ba18345b478138a8c839966e5e521fab5bc3e916a41ff54e35921a3b791d378dee5d52985b041a1c85d55c2f954a03c084f4cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(flask-mail) \
python39-Flask-Mail \
python3dist(flask-mail)"

RDEPENDS:${PN} += "python(abi) \
python39-Flask \
python39-blinker"

inherit rpm
