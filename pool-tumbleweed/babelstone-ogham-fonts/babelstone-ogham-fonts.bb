SUMMARY = "BabelStone Font for Ogham Script"
DESCRIPTION = "A set of twelve Unicode Ogham fonts in seven font families, representing \
a variety of different styles of Ogham letters found in manuscripts and \
on Ogham stone inscriptions."
LICENSE = "OFL-1.1"

PV = "20220314"

RPM_NAME = "babelstone-ogham-fonts-20220314-1.1.noarch.rpm"
RPM_HASH = "f8794762ec67f044fc5e5d700bb76d33806654b6396ad92a0ee121d9940ee4b09e3db913f5641d104097a17cb6a50fa27cd719bea60d6285fe08960b94f5f7e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "babelstone-ogham-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
