SUMMARY = "Progress bars for Python"
DESCRIPTION = "Progress bars for Python."
LICENSE = "ISC"

PV = "1.6"

RPM_NAME = "python311-progress-1.6-1.8.noarch.rpm"
RPM_HASH = "1b838d1e36cd8a05320562e3e52daae15a521d2bac9eb7a3f257826c309acac8379584b2c47f9ece45d810a67e53f355e933926a0044dae15403f40648c04632"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(progress) \
python311-progress \
python3dist(progress)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
