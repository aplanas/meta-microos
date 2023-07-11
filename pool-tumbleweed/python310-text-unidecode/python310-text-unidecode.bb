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

RPM_NAME = "python310-text-unidecode-1.3-2.3.noarch.rpm"
RPM_HASH = "6405b79fa4e23e99390fcfee457ad5fd4e8c11d6862b0a2ce600dfb508fdf6006daf2475cf584518d3a96fc63e6ab3e3024ad997d1cc07e77ba51a4bcbfcd855"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-text-unidecode \
python310-text-unidecode \
python3dist-text-unidecode"

RDEPENDS:${PN} += "python-abi"

inherit rpm
