SUMMARY = "Useragent faker package for Python"
DESCRIPTION = "Useragent faker with real world database."
LICENSE = "Apache-2.0"

PV = "1.1.3"

RPM_NAME = "python311-fake-useragent-1.1.3-1.3.noarch.rpm"
RPM_HASH = "b1e02a4b3aa188d0b878c2fb53dc32393489819663c95a4ac8a5fa2b7f2503a9c629590a245b21fffcbaa8579ed5cac06bc285b00c74674a0963ea5301624199"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fake-useragent \
python3.11dist-fake-useragent \
python311-fake-useragent \
python3dist-fake-useragent"

RDEPENDS:${PN} += "python-abi \
python311-importlib-resources"

inherit rpm
