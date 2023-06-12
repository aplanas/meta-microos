SUMMARY = "Tool for automatic manual page building from a Python ArgumentParser object"
DESCRIPTION = "This utility generates a manual page in an automatic way from an \
ArgumentParser object, so the manpage 1:1 corresponds to the \
automatically generated --help output. The manpage generator needs to \
known the location of the object, user can specify that by (a) the \
module name or corresponding python filename and (b) the object name \
or the function name which returns the object. There's a limited \
support for (deprecated) optparse objects, too."
LICENSE = "Apache-2.0"

PV = "4.1"

RPM_NAME = "python310-argparse-manpage-4.1-1.1.noarch.rpm"
RPM_HASH = "3c95e14bf09f788a70f0b2f055f725473e524d6692e9b5c110e33921a82fbdd2cb150505b3f08ecf34d4b85b039c8b1da2be394b7f08c2d9fcc0b8743d6bbcb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-argparse-manpage \
python3.10dist(argparse-manpage) \
python310-argparse-manpage \
python3dist(argparse-manpage)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-setuptools \
update-alternatives"

inherit rpm
