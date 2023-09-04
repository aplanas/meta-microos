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

PV = "1.0.9+git20230818.02b2665"

RPM_NAME = "lite-xl-plugin-manager-1.0.9+git20230818.02b2665-1.1.aarch64.rpm"
RPM_HASH = "e0e2f642f8e06e1da4475b5a6dbee1cbcaee29a666e137e80d776c022bbec4c19574b21515307367905370a5a1dbdca26a1117c19aac41a66f43102ff7af8d92"

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
