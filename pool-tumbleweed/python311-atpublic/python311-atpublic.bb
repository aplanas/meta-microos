SUMMARY = "@public decorator for populating __all__"
DESCRIPTION = "public -- @public for populating __all__."
LICENSE = "Apache-2.0"

PV = "3.1.1"

RPM_NAME = "python311-atpublic-3.1.1-3.3.noarch.rpm"
RPM_HASH = "a88b813aab7158a96ca18de40a1f9e4debc6e62f171fd7fb19113aa50cab454fce6a4e5959d8c097026caf95b4e41c73db89f0265f158aeeddc3876c3fc88647"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-atpublic \
python3.11dist-atpublic \
python311-atpublic \
python3dist-atpublic"

RDEPENDS:${PN} += "python-abi"

inherit rpm
