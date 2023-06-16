SUMMARY = "BabelStone Font for Marchen script"
DESCRIPTION = "BabelStone Marchen is a font for the sMar-chen script, which is based \
on the deprecated experimental BabelStone Tibetan sMar-chen font. This \
font uses the encoding specified by Unicode for Marchen script."
LICENSE = "OFL-1.1"

PV = "9.003"

RPM_NAME = "babelstone-marchen-fonts-9.003-1.1.noarch.rpm"
RPM_HASH = "39cd16bf560fd86c4ca9ab7660f4170fe5d53c2f01cb8a96627b125210c9de8b2f86111e97104a89ca57b7bae71398b0789ccc799bbd0ddad9b6ff7fbd6eb256"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "babelstone-marchen-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
