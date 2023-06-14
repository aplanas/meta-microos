SUMMARY = "Useragent faker package for Python"
DESCRIPTION = "Useragent faker with real world database."
LICENSE = "Apache-2.0"

PV = "1.1.3"

RPM_NAME = "python311-fake-useragent-1.1.3-1.1.noarch.rpm"
RPM_HASH = "77d5198115267248e3f324c012e5912c91551f84ef08db9ee03c10a44875be060f8ac03e38c7b7ba17a267eb14f7706d23991529dd6e61aedc9eed36a80215ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-fake-useragent \
python311-fake-useragent \
python3dist-fake-useragent"

RDEPENDS:${PN} += "python-abi \
python311-importlib-resources"

inherit rpm
