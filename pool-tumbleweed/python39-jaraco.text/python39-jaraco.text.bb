SUMMARY = "Tools to work with text"
DESCRIPTION = "This package provides handy routines for dealing with text, such as \
wrapping, substitution, trimming, stripping, prefix and suffix removal, \
line continuation, indentation, comment processing, identifier processing, \
values parsing, case insensitive comparison, and more."
LICENSE = "MIT"

PV = "3.11.1"

RPM_NAME = "python39-jaraco.text-3.11.1-1.1.noarch.rpm"
RPM_HASH = "9c08dbe308f5b017a968912a98bd3efdac6140de64683b05574fdc750653c21f4c053d451884cf212ca2c9508a859720185df44ec34286456b3fdb7d04992e1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jaraco.text) \
python39-jaraco.text \
python3dist(jaraco.text)"

RDEPENDS:${PN} += "python(abi) \
python39-autocommand \
python39-inflect \
python39-jaraco.context \
python39-jaraco.functools \
python39-more-itertools"

inherit rpm
