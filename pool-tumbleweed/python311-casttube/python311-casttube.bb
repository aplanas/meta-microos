SUMMARY = "YouTube chromecast api"
DESCRIPTION = "casttube provides a way to interact with the Youtube Chromecast api."
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "python311-casttube-0.2.1-2.3.noarch.rpm"
RPM_HASH = "b090cbb5a8c7c7d6b1f1a5639c436a326364fba520a9024d1326146df288fc7b6ce25a1a71e0e3357765814ae7b0c02441d94613d82decd184710baff3f14a1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(casttube) \
python311-casttube \
python3dist(casttube)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
