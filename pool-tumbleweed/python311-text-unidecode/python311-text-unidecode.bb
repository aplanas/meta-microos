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

RPM_NAME = "python311-text-unidecode-1.3-2.3.noarch.rpm"
RPM_HASH = "19385bacb82dee3f41c4775f4d772d073a373ffee790e6c0ec01e4de4429288f1e6b336d2e3d2389e45113e6408c39f3b71b60796eae8e042f77ca39cd8ebe14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-text-unidecode \
python3.11dist-text-unidecode \
python311-text-unidecode \
python3dist-text-unidecode"

RDEPENDS:${PN} += "python-abi"

inherit rpm
