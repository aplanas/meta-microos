SUMMARY = "Code for parsing and dealing with URI"
DESCRIPTION = "The lazr.uri package includes code for parsing and dealing with URIs."
LICENSE = "LGPL-3.0-or-later"

PV = "1.0.6"

RPM_NAME = "python311-lazr.uri-1.0.6-1.10.noarch.rpm"
RPM_HASH = "7842aeabd9c1dd9343a073b5ce1a40c0e9d695c8a4ee20d74a065e0e8350216c0580ecf48f3eb8da2078aac64d8114790427265928e107bb5e086c801de5727d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-lazr.uri \
python3.11dist-lazr.uri \
python311-lazr.uri \
python3dist-lazr.uri"

RDEPENDS:${PN} += "python-abi"

inherit rpm
