SUMMARY = "Configuration file loader"
DESCRIPTION = "derpconf abstracts loading configuration files for your app."
LICENSE = "MIT"

PV = "0.8.3"

RPM_NAME = "python310-derpconf-0.8.3-2.1.noarch.rpm"
RPM_HASH = "0b9134a0753e1e3634435eb1e4e22633609590fd83376b4d13126384ad1119001fad913b242fccfa3062cb5023efa8a0a396dad51af627feeb3166c40d82f23f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-derpconf \
python3.10dist(derpconf) \
python310-derpconf \
python3dist(derpconf)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
