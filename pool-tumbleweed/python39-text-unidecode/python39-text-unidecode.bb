SUMMARY = "The most basic Text::Unidecode port"
DESCRIPTION = "text-unidecode is the most basic port of the Text::Unidecode Perl library. \
 \
There are other Python ports of Text::Unidecode (unidecode and \
isounidecode). unidecode is GPL; isounidecode doesn’t support Python 3 \
and uses too much memory. \
 \
This port is licensed under Artistic License and supports both Python \
2.x and 3.x."
LICENSE = "Artistic-1.0 | GPL-2.0-or-later"

PV = "1.3"

RPM_NAME = "python39-text-unidecode-1.3-2.3.noarch.rpm"
RPM_HASH = "de53ee4e6d44cfe7de98f6305af94a217c6f82f6665c89f61c8419a6210810114117b664f5bfd8ea124d976a7c3222c798a652f55eaee9b4330df1251cbc02e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-text-unidecode \
python39-text-unidecode \
python3dist-text-unidecode"

RDEPENDS:${PN} += "python-abi"

inherit rpm
