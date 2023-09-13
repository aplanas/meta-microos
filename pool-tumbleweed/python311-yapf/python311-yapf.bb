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

PV = "0.40.1"

RPM_NAME = "python311-yapf-0.40.1-1.1.noarch.rpm"
RPM_HASH = "d42c97686ba47a954fce6721912f2ed8a44f5d9d508d8f8f3aee65cc6e4cdb1b4eb0188f9897871b2ee94bcd97b97334eba5e8b16256c609ef0f9d193256f6ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-yapf \
python3.11dist-yapf \
python311-yapf \
python3dist-yapf"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-platformdirs \
update-alternatives"

inherit rpm
