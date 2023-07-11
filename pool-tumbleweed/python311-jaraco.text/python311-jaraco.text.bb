SUMMARY = "Tools to work with text"
DESCRIPTION = "This package provides handy routines for dealing with text, such as \
wrapping, substitution, trimming, stripping, prefix and suffix removal, \
line continuation, indentation, comment processing, identifier processing, \
values parsing, case insensitive comparison, and more."
LICENSE = "MIT"

PV = "3.11.1"

RPM_NAME = "python311-jaraco.text-3.11.1-2.3.noarch.rpm"
RPM_HASH = "53371acf2898a727caa6f530fe3aed6376b25858d1bc2c542eba57629fe037c6de36bb5358ef57b2f4e8e47dff22fd474ce44544ac13720aa48f58a2033eef6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jaraco.text \
python3.11dist-jaraco.text \
python311-jaraco.text \
python3dist-jaraco.text"

RDEPENDS:${PN} += "python-abi \
python311-autocommand \
python311-inflect \
python311-jaraco.context \
python311-jaraco.functools \
python311-more-itertools"

inherit rpm
