SUMMARY = "A formatter for Python code"
DESCRIPTION = "YAPF is based off clang-format and reformats it to the closest \
formatting that conforms to the style guide, even if the original \
code did not violate the style guide. \
 \
This is in contrast to other formatters like autopep8 and pep8ify \
which are made to only remove lint errors from code, which has some \
limitations, like, code that conforms to the PEP 8 guidelines may not \
be reformatted."
LICENSE = "Apache-2.0"

PV = "0.33.0"

RPM_NAME = "python311-yapf-0.33.0-1.1.noarch.rpm"
RPM_HASH = "fc89f871b2bfc24a654d439b4c98b27b41c89cf3ca56b5625a6984373fda7cc88fa26aa5fd92ea8a24dad5a335f7140c6b44833ae3f3bdcca9ba322a75317d8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-yapf \
python311-yapf \
python3dist-yapf"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
update-alternatives"

inherit rpm
