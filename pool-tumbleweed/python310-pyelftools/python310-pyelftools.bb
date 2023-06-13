SUMMARY = "Library for analyzing ELF files and DWARF debugging information"
DESCRIPTION = "pyelftools is a pure python library for analyzing ELF files and DWARF debugging information"
LICENSE = "SUSE-Public-Domain"

PV = "0.29"

RPM_NAME = "python310-pyelftools-0.29-1.4.noarch.rpm"
RPM_HASH = "52533743c045ada5b72e98bf037579b714d693b075324fe7d6bd1bfb16b9e8d6cc921001350dac189ee82951ad1f8892efe12fde8d45157768107e744276e00a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyelftools \
python3.10dist(pyelftools) \
python310-pyelftools \
python3dist(pyelftools)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
update-alternatives"

inherit rpm
