SUMMARY = "Code audit tool for python"
DESCRIPTION = "Code audit tool for Python. Pylama wraps these tools: \
 \
- pycodestyle (formerly pep8) © 2012-2013, Florent Xicluna; \
- pydocstyle (formerly pep257 by Vladimir Keleshev) © 2014, Amir Rachum; \
- PyFlakes © 2005-2013, Kevin Watters; \
- Mccabe © Ned Batchelder; \
- Pylint © 2013, Logilab; \
- Radon © Michele Lacchia \
- eradicate © Steven Myint; \
- Mypy © Jukka Lehtosalo and contributors; \
- Vulture © Jendrik Seipp and contributors;"
LICENSE = "MIT"

PV = "8.4.1"

RPM_NAME = "python311-pylama-8.4.1-3.1.noarch.rpm"
RPM_HASH = "407cc04657af67e281860ace37501d10ebccdd4bbef58c1fd6f57915921787ff296dec87cd97f78e5bbc1316335f85955e9aeae62ac02b758fbb51ea26955fe1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pylama \
python3.11dist-pylama \
python311-pylama \
python3dist-pylama"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-mccabe \
python311-pycodestyle \
python311-pydocstyle \
python311-pyflakes \
update-alternatives"

inherit rpm
