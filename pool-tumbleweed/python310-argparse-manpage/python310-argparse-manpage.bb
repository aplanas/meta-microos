SUMMARY = "Tool for automatic manual page building from a Python ArgumentParser object"
DESCRIPTION = "This utility generates a manual page in an automatic way from an \
ArgumentParser object, so the manpage 1:1 corresponds to the \
automatically generated --help output. The manpage generator needs to \
known the location of the object, user can specify that by (a) the \
module name or corresponding python filename and (b) the object name \
or the function name which returns the object. There's a limited \
support for (deprecated) optparse objects, too."
LICENSE = "Apache-2.0"

PV = "4.3"

RPM_NAME = "python310-argparse-manpage-4.3-1.1.noarch.rpm"
RPM_HASH = "ad33d555f9070a4c48bb65d5e785d208da4b8103ecb93117acfcfbbd11e28c189dbe2334d1edd042d770c906fed8607bc49720f2de879c20bef83ac6b78767c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-argparse-manpage \
python310-argparse-manpage \
python3dist-argparse-manpage"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-setuptools \
python310-tomli \
update-alternatives"

inherit rpm
