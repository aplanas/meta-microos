SUMMARY = "PEP 567 (context variables) backport"
DESCRIPTION = "PEP 567 (Context Variables) backport."
LICENSE = "Apache-2.0"

PV = "2.4"

RPM_NAME = "python311-contextvars-2.4-5.1.noarch.rpm"
RPM_HASH = "4dd31fe36b7af31ba3d922c209c43ee8a45cdc2b06879503b559b4aab373d360d5b003d29f04301129a27bf8e0860c7f51d5384b4959ef7405fa03a13fc3cf41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-contextvars \
python3.11dist-contextvars \
python311-contextvars \
python3dist-contextvars"

RDEPENDS:${PN} += "python-abi \
python311-immutables"

inherit rpm
