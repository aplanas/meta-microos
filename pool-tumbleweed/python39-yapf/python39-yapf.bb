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

RPM_NAME = "python39-yapf-0.33.0-1.3.noarch.rpm"
RPM_HASH = "85b755c8cf4d42984c9efe614707105df36a569be6b04271c1ca9559bc09adf038107ac110ef1466dc6afd76dcd0e5ebc1c3212a0e2ca2e5cce745d54f658069"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-yapf \
python39-yapf \
python3dist-yapf"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
