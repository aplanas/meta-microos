SUMMARY = "Expand Standard Functools to Methods"
DESCRIPTION = "Expand functools features to methods, classmethods, \
staticmethods and even for (unofficial) hybrid methods."
LICENSE = "BSD-2-Clause"

PV = "0.4.2"

RPM_NAME = "python311-methodtools-0.4.2-1.14.noarch.rpm"
RPM_HASH = "51f6b4004e4d10aa291a165a25c5fcf33fccdbb8035c57857e43154b8c76b20f89bb09b23a339a74fb2577fc51b2f2954c11d6f9db86f652bedde6cedf650e5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-methodtools \
python3.11dist-methodtools \
python311-methodtools \
python3dist-methodtools"

RDEPENDS:${PN} += "python-abi \
python311-wirerope"

inherit rpm
