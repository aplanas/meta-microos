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

RPM_NAME = "python311-yapf-0.33.0-1.3.noarch.rpm"
RPM_HASH = "135d72c59cad60321165a34c32955f266db4f51d2d786e5e7a5a726415169c16fdbc12fe052b072b01ac08bf16a672d66ede9a98e96cfca1a7ba6009223b918e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-yapf \
python3.11dist-yapf \
python311-yapf \
python3dist-yapf"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
