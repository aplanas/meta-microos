SUMMARY = "A lite-xl plugin manager"
DESCRIPTION = "* A standalone binary that provides an easy way of installing, and uninstalling \
  plugins from lite-xl, as well as different version of lite-xl. \
* Can be used by a package manager plugin that works from inside the editor and \
  calls this binary. \
* Also contains a plugin_manager.lua plugin to integrate the binary with lite \
  in the form of an easy-to-use GUI. \
* By default in releases, lpm will automatically consume the manifest.json in \
  the latest branch of this repository, which corresponds to the most recent versioned release. \
* Conforms to SCPS3."
LICENSE = "MIT"

PV = "1.0.10+git20230827.2452630"

RPM_NAME = "lite-xl-plugin-manager-1.0.10+git20230827.2452630-1.1.aarch64.rpm"
RPM_HASH = "146254a860f87b70e44efa9d951b14325c506f6e4879ecd54c4f2eeb62bece7e8aaa9ebc7d5a093fd211f37ac8143de333e11c92c6b6c58f8085fdd23e135420"

RPROVIDES:${PN} += "lite-xl-plugin-manager"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgit2.so.1.7 \
liblua5.4.so.5 \
libmbedcrypto.so.7 \
libmbedtls.so.14 \
libmbedx509.so.1 \
libz.so.1 \
libzip.so.5 \
lite-xl"

inherit rpm
