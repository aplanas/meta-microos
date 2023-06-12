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

RPM_NAME = "python39-text-unidecode-1.3-2.1.noarch.rpm"
RPM_HASH = "72248a4215258572b81a716e7d54b4250ef830776fcd662de5ceb92661b44a2610baa1cc3c810f2fc267a1b1befca9f1439ddb6d87a4cc99fc72f0afd5cb713d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(text-unidecode) \
python39-text-unidecode \
python3dist(text-unidecode)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
