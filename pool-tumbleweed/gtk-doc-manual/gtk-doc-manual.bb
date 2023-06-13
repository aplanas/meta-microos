SUMMARY = "Manual for Gtkdoc"
DESCRIPTION = "User manual for Gtkdoc"
LICENSE = "GFDL-1.1-or-later"

PV = "1.33.2"

RPM_NAME = "gtk-doc-manual-1.33.2-1.4.noarch.rpm"
RPM_HASH = "1c70606fce24d5eda1fb0f4ae15388b0183694223b14fa43742205135820b67441396f45ad94e9c4ba2cee1f3d94622425c584258b5eeafe2d4e944d4a0961ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk-doc-manual \
gtk-doc:/usr/share/help/C/gtk-doc-manual/index.docbook"

RDEPENDS:${PN} += ""

inherit rpm
