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

RPM_NAME = "python310-pylama-8.4.1-2.1.noarch.rpm"
RPM_HASH = "992ec82ce01c8c7da996b408a04eee366280f24cf21d1a9916e297c7a4902978df560304d919647f2f35ef65ef9f23a8e14fd79b1945cb4d5801064fae2847e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pylama \
python3.10dist-pylama \
python310-pylama \
python3dist-pylama"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-mccabe \
python310-pycodestyle \
python310-pydocstyle \
python310-pyflakes \
update-alternatives"

inherit rpm
