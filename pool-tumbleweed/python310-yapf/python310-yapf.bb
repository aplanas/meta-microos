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

RPM_NAME = "python310-yapf-0.33.0-1.3.noarch.rpm"
RPM_HASH = "eef8dabdb5ba457e8ba1d9106f45aa1d0fe0af0e0d6404c8e0c4e8871da8f2d259644b62607cb815009071025d872ab02321429c203d68b038ebd1aa74735018"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-yapf \
python310-yapf \
python3dist-yapf"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
