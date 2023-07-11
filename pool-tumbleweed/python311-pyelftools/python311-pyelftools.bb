SUMMARY = "Library for analyzing ELF files and DWARF debugging information"
DESCRIPTION = "pyelftools is a pure python library for analyzing ELF files and DWARF debugging information"
LICENSE = "SUSE-Public-Domain"

PV = "0.29"

RPM_NAME = "python311-pyelftools-0.29-1.5.noarch.rpm"
RPM_HASH = "73b0163becd8a995a27546aa3c586bb2250fd4a4618afadf6d4687869ba8b3a48f08c340189846d51b60ae575bd0506db274182c44eef4a2a66893ec5b1bff42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyelftools \
python3.11dist-pyelftools \
python311-pyelftools \
python3dist-pyelftools"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
