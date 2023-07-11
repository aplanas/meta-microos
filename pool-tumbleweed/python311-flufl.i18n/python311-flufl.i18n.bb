SUMMARY = "High level API for internationalizing Python libraries and applications"
DESCRIPTION = "High level API for internationalizing Python libraries and applications."
LICENSE = "Apache-2.0"

PV = "4.1.1"

RPM_NAME = "python311-flufl.i18n-4.1.1-3.3.noarch.rpm"
RPM_HASH = "e4f39ca2c41457c7a5ca6ee172fe1ef5ef67bb562bc76620386bc255f67c8b4e0304b459d6065186657c450f40e03783020ff796e07ab69270c9a0a7287ba5b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flufl.i18n \
python3.11dist-flufl.i18n \
python311-flufl.i18n \
python3dist-flufl.i18n"

RDEPENDS:${PN} += "python-abi \
python311-atpublic"

inherit rpm
