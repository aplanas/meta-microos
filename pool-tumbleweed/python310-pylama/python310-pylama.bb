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

RPM_NAME = "python310-pylama-8.4.1-3.1.noarch.rpm"
RPM_HASH = "3ebbfd35aec983fa4787a1912734d85b54ce44a636a9a0e483ab10625225e5b73575ab609ffb8c429241c6ab498e5a6c5220375f46b4d0a08abec93af02df083"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pylama \
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
