SUMMARY = "Varianter with combinatorial capabilities by PICT"
DESCRIPTION = "This plugin uses a third-party tool to provide variants created by \
Pair-Wise algorithms, also known as Combinatorial Independent Testing."
LICENSE = "GPL-2.0-only"

PV = "69.0"

RPM_NAME = "python3-avocado-plugins-varianter-pict-69.0-6.11.noarch.rpm"
RPM_HASH = "87a3c55edef8b4d57c633b71dc00589580ffa98ec865b4a65419dc5b7107d51861e415fbfcb16bb1a0b37d6162119900df230f21e5255135365c674f19170533"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-avocado-plugins-varianter-pict \
python3.11dist-avocado-framework-plugin-varianter-pict \
python3dist-avocado-framework-plugin-varianter-pict"

RDEPENDS:${PN} += "python-abi \
python3-avocado"

inherit rpm
