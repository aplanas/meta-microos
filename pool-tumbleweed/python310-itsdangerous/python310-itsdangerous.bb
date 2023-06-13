SUMMARY = "Various helpers to pass trusted data to untrusted environments and back"
DESCRIPTION = "It's Dangerous \
   ... so better sign this \
 \
Various helpers to pass data to untrusted environments and to get it back \
safe and sound. \
 \
This repository provides a module that is a port of the django signing \
module.  It's not directly copied but some changes were applied to \
make it work better on its own. \
 \
Also I plan to add some extra things.  Work in progress."
LICENSE = "BSD-3-Clause"

PV = "2.1.2"

RPM_NAME = "python310-itsdangerous-2.1.2-2.1.noarch.rpm"
RPM_HASH = "0b91a89a653cdec38faab24bb359e1120fad46ed0702a285760e98485548589cedd41b0df56b13048b1c17ccc91b65b876e567c5ec6a0dc9d5464346ff868f82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-itsdangerous \
python3.10dist(itsdangerous) \
python310-itsdangerous \
python3dist(itsdangerous)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
