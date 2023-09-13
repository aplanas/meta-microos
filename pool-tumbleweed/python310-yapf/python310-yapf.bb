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

RPM_NAME = "python310-yapf-0.40.1-1.1.noarch.rpm"
RPM_HASH = "91070294c993733cc6afe400659bb44c693538c0958f981f2f8d1c0c86e9f66f756d0304f774dd19cf30bc14d686e38f94f74448706c93525017bdf63922c93a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-yapf \
python310-yapf \
python3dist-yapf"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-platformdirs \
update-alternatives"

inherit rpm
