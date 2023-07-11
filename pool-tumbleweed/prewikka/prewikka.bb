SUMMARY = "Graphical front-end analysis console for the Prelude Framework"
DESCRIPTION = "Prewikka is the graphical front-end analysis console for the Prelude \
Universal SIM. Prewikka provides alert aggregation and sensor and \
hearbeat views, and has user management and configurable filters, as \
well as access to external tools such as whois and traceroute."
LICENSE = "GPL-2.0-or-later"

PV = "5.2.0"

RPM_NAME = "prewikka-5.2.0-2.8.noarch.rpm"
RPM_HASH = "44520a0a4fdb7bea9249383506f0b55db855878b2e870175882f5bd6e454e4ab661e7521bd516f5be0e37a3fded6906599bc4efb8117d7b04e46422898335777"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-prewikka \
prewikka \
prewikka-core \
python3.11dist-prewikka \
python3dist-prewikka"

RDEPENDS:${PN} += "/usr/bin/python3 \
prewikka-lang \
python-abi \
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
