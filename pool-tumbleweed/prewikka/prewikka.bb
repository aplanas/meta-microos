SUMMARY = "Graphical front-end analysis console for the Prelude Framework"
DESCRIPTION = "Prewikka is the graphical front-end analysis console for the Prelude \
Universal SIM. Prewikka provides alert aggregation and sensor and \
hearbeat views, and has user management and configurable filters, as \
well as access to external tools such as whois and traceroute."
LICENSE = "GPL-2.0-or-later"

PV = "5.2.0"

RPM_NAME = "prewikka-5.2.0-2.7.noarch.rpm"
RPM_HASH = "83675c9697d8f907ee4c3b383aaf6df177861d73eda5b292bf458b61c51c4d72c9ef26647a7aed15ff9f07b82ad6820f7cd12438ec81c2c44c20e049f3b6b1b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(prewikka) \
prewikka \
prewikka-core \
python3.10dist(prewikka) \
python3dist(prewikka)"

RDEPENDS:${PN} += "/usr/bin/python3 \
prewikka-lang \
python(abi) \
python3-Babel \
python3-Mako \
python3-PyYAML \
python3-Werkzeug \
python3-croniter \
python3-gevent \
python3-lark-parser \
python3-libprelude \
python3-libpreludedb \
python3-python-dateutil \
python3-pytz \
python3-voluptuous \
xorg-x11-fonts"

inherit rpm
