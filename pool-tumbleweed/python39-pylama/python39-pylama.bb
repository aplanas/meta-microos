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

RPM_NAME = "python39-pylama-8.4.1-3.1.noarch.rpm"
RPM_HASH = "172c5feb39f445559ad0a205a4a261235940bfa37255a71b21af67f75acbb12a863c6d628f251e8d6f35ffdabb952650f1045d12a816dd8f2e414c14b18e7efa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pylama \
python39-pylama \
python3dist-pylama"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-mccabe \
python39-pycodestyle \
python39-pydocstyle \
python39-pyflakes \
update-alternatives"

inherit rpm
