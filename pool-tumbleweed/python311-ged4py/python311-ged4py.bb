SUMMARY = "GEDCOM tools for Python"
DESCRIPTION = "GEDCOM tools for Python."
LICENSE = "MIT"

PV = "0.1.12"

RPM_NAME = "python311-ged4py-0.1.12-1.14.noarch.rpm"
RPM_HASH = "be8603a231a2a4393821b5f2634569b56700db7928c7fcbd5711d676096e665a4b6a552bdab6150858741c37bbe8d62d65521288ccfa1120aee53fa413b3072d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-ged4py \
python311-ged4py \
python3dist-ged4py"

RDEPENDS:${PN} += "python-abi \
python311-ansel"

inherit rpm
