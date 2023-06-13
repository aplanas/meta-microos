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

RPM_NAME = "python310-text-unidecode-1.3-2.1.noarch.rpm"
RPM_HASH = "252b3dac0633b59213784855ada0ed59be0bd3798bc481657fba24c62bac7d5cd8f1e961e0ff2987136614c3ca0d3e5b16cc588e19adcdd9502196f9a45994dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-text-unidecode \
python3.10dist(text-unidecode) \
python310-text-unidecode \
python3dist(text-unidecode)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
