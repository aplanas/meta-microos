SUMMARY = "A collection of classes implementing the pen protocol for manipulating glyphs"
DESCRIPTION = "A collection of classes implementing the pen protocol for manipulating glyphs."
LICENSE = "BSD-3-Clause"

PV = "0.2.4"

RPM_NAME = "python39-fontPens-0.2.4-5.9.noarch.rpm"
RPM_HASH = "1f5fdbbc50e271e5abd5bf2d947e08f24f4c85f6728465f7679497ef2d0dbbdd045450c458e3abd4db47b32042e36fc8a5a2cadfaad0defab84953e5b8693417"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-fontpens \
python39-fontPens \
python3dist-fontpens"

RDEPENDS:${PN} += "python-abi \
python39-FontTools"

inherit rpm
