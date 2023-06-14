SUMMARY = "The unofficial Django swappable models API"
DESCRIPTION = "Swapper is an unofficial API for the undocumented but very \
powerful Django feature: swappable models. Swapper facilitates \
implementing arbitrary swappable models in your own reusable apps."
LICENSE = "MIT"

PV = "1.1.2.post1"

RPM_NAME = "python39-swapper-1.1.2.post1-2.7.noarch.rpm"
RPM_HASH = "e36fa9c81423e859fb73505ac4573626add4db3bd0b33206d56ae95f634103c75f6f8a07d83fd5e4508326eb4a15e21210c37fea26770a4f5efcc83c7ab819a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-swapper \
python39-swapper \
python3dist-swapper"

RDEPENDS:${PN} += "python-abi \
python39-Django"

inherit rpm
