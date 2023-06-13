SUMMARY = "Multithreaded Click apps made easy"
DESCRIPTION = "Utilities for multithreading in click <http://click.pocoo.org/>. \
*This is rather experimental.  See tests for usage for now.*"
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python39-click-threading-0.5.0-1.8.noarch.rpm"
RPM_HASH = "26e015f3e407c76af8de94ba6f3eff4d839a3084a25c25250ae413fe353010065fab8d90d1fc470b8b6fa9c2f942ced6ed2424df390771ff5f83e3aac9c59375"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(click-threading) \
python39-click-threading \
python3dist(click-threading)"

RDEPENDS:${PN} += "python(abi) \
python39-click"

inherit rpm
