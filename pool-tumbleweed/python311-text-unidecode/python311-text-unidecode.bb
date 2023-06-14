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

RPM_NAME = "python311-text-unidecode-1.3-2.1.noarch.rpm"
RPM_HASH = "6cc9b400786efb977a766a862c798785c9276795dd9c7fdd3c9429fb0a87372964d2a49f126bae147256c5290693c8c8178d13d1eef0998dcccca8774ba341b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-text-unidecode \
python311-text-unidecode \
python3dist-text-unidecode"

RDEPENDS:${PN} += "python-abi"

inherit rpm
