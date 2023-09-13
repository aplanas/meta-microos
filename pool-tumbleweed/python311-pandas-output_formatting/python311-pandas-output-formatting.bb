SUMMARY = "The python pandas[output_formatting] extra"
DESCRIPTION = "This package provides the [output_formatting] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python311-pandas-output_formatting-2.1.0-1.2.noarch.rpm"
RPM_HASH = "ec25ec9258f5de1cd5d7b007b3b3f37b24ab80b0d941604e032d18fbe1f3fe83e0c18f9dca309f6390c20cfd0f6b808b6742a079fd764ddf30106d7a622c6bd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-output-formatting \
python311-pandas-output-formatting"

RDEPENDS:${PN} += "python311-Jinja2 \
python311-pandas \
python311-tabulate"

inherit rpm
