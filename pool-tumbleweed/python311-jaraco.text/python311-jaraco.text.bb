SUMMARY = "Tools to work with text"
DESCRIPTION = "This package provides handy routines for dealing with text, such as \
wrapping, substitution, trimming, stripping, prefix and suffix removal, \
line continuation, indentation, comment processing, identifier processing, \
values parsing, case insensitive comparison, and more."
LICENSE = "MIT"

PV = "3.11.1"

RPM_NAME = "python311-jaraco.text-3.11.1-1.1.noarch.rpm"
RPM_HASH = "3fbcfde4ca66dbebd33ae105c1b8634ea6335c16888823b5328de08a71088bccb2d8d1530ff0c8101c87a2e1655330024081b83309eda5527d8c6cb952ad9a88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(jaraco.text) \
python311-jaraco.text \
python3dist(jaraco.text)"
RDEPENDS:${PN} += "python(abi) \
python311-autocommand \
python311-inflect \
python311-jaraco.context \
python311-jaraco.functools \
python311-more-itertools"

inherit rpm
