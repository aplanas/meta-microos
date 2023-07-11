SUMMARY = "The etckeeper integration function with ZYpp"
DESCRIPTION = "The etckeeper-zypp-plugin calls etckeeper from ZYpp."
LICENSE = "GPL-2.0-or-later"

PV = "1.18.18"

RPM_NAME = "etckeeper-zypp-plugin-1.18.18-2.3.noarch.rpm"
RPM_HASH = "7371cc69dd1ae859455b6360068ae8e85be5a1fd9e6ffbcf193a443ec539a86f26589889df6b462b085a9b368fa99abb4b1e9df771cb642a3ada2e51e19c5e99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "etckeeper-/usr/lib/zypp/plugins/commit/zypper-etckeeper.py \
etckeeper-pkgmanager-collabo \
etckeeper-zypp-plugin"

RDEPENDS:${PN} += "/usr/bin/python3 \
etckeeper \
python3-zypp-plugin"

inherit rpm
