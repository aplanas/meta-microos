SUMMARY = "Tools to work with text"
DESCRIPTION = "This package provides handy routines for dealing with text, such as \
wrapping, substitution, trimming, stripping, prefix and suffix removal, \
line continuation, indentation, comment processing, identifier processing, \
values parsing, case insensitive comparison, and more."
LICENSE = "MIT"

PV = "3.11.1"

RPM_NAME = "python310-jaraco.text-3.11.1-2.3.noarch.rpm"
RPM_HASH = "10adef05fd073b5473e94c764d4946b961293735c28dd97ab694c75d6127caae653870bb677621e207a15cc5fe9e44c6dbdde8a38479e4965778aa50ed1d8841"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jaraco.text \
python310-jaraco.text \
python3dist-jaraco.text"

RDEPENDS:${PN} += "python-abi \
python310-autocommand \
python310-inflect \
python310-jaraco.context \
python310-jaraco.functools \
python310-more-itertools"

inherit rpm
