SUMMARY = "Tools to work with text"
DESCRIPTION = "This package provides handy routines for dealing with text, such as \
wrapping, substitution, trimming, stripping, prefix and suffix removal, \
line continuation, indentation, comment processing, identifier processing, \
values parsing, case insensitive comparison, and more."
LICENSE = "MIT"

PV = "3.11.1"

RPM_NAME = "python39-jaraco.text-3.11.1-2.3.noarch.rpm"
RPM_HASH = "984dcb4fd2f213dfcb956e2b7ebe3ea91769605a571526b5a65c7ec7bf4a887a4271c1e266aedd30f2958e17b50f7910b0c1ca64d99b4643fb7896cefe5f1885"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jaraco.text \
python39-jaraco.text \
python3dist-jaraco.text"

RDEPENDS:${PN} += "python-abi \
python39-autocommand \
python39-inflect \
python39-jaraco.context \
python39-jaraco.functools \
python39-more-itertools"

inherit rpm
