SUMMARY = "Useragent faker package for Python"
DESCRIPTION = "Useragent faker with real world database."
LICENSE = "Apache-2.0"

PV = "1.2.1"

RPM_NAME = "python310-fake-useragent-1.2.1-1.1.noarch.rpm"
RPM_HASH = "60eec5c2fc91a025801e899c1b5372fbc7d7c36830ce682a898589e6be7395f0d1d8659ac5644f6af1b12d8fee72edfb99b6fa3f88f109cfca1852cb9c481fad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-fake-useragent \
python310-fake-useragent \
python3dist-fake-useragent"

RDEPENDS:${PN} += "python-abi \
python310-importlib-resources"

inherit rpm
